package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.entity.Doc;
import com.jiawa.wiki.mapper.DocMapper;
import com.jiawa.wiki.service.IDocService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文档 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@Service
public class DocServiceImpl extends ServiceImpl<DocMapper, Doc> implements IDocService {

}
