package com.jiawa.wiki.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiawa.wiki.entity.Ebook;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookQueryReq;
import com.jiawa.wiki.req.PageReq;
import com.jiawa.wiki.resp.EbookQueryResp;
import com.jiawa.wiki.resp.PageResp;
import com.jiawa.wiki.service.IEbookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jiawa.wiki.util.CopyUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 电子书 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@Service
@Slf4j
public class EbookServiceImpl extends ServiceImpl<EbookMapper, Ebook> implements IEbookService {
    @Resource
    private EbookMapper ebookMapper;

    @Override
    public PageResp<EbookQueryResp> list(PageReq<EbookQueryReq> req) {
        QueryWrapper<Ebook> ebookQueryWrapper = new QueryWrapper<>();
        EbookQueryReq obj = req.getObj();
        if (obj != null) {
            if (!ObjectUtils.isEmpty(obj.getName())) {
                ebookQueryWrapper.like("name", obj.getName());
            }
            if (!ObjectUtils.isEmpty(obj.getCategoryId2())) {
                ebookQueryWrapper.eq("category2_id", obj.getCategoryId2());
            }
        }

        PageHelper.startPage(req.getPage(), req.getSize());
        List<Ebook> ebookList = ebookMapper.selectList(ebookQueryWrapper);

        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        // 列表复制

        List<EbookQueryResp> list = CopyUtil.copyList(ebookList, EbookQueryResp.class);

        PageResp<EbookQueryResp> pageResp = new PageResp();
        pageResp.setTotal(pageInfo.getTotal());
        pageResp.setList(list);
        return pageResp;
    }
}
