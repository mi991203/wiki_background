package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.entity.Content;
import com.jiawa.wiki.mapper.ContentMapper;
import com.jiawa.wiki.service.IContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文档内容 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

}
