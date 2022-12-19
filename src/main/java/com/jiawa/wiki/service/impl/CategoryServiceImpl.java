package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.entity.Category;
import com.jiawa.wiki.mapper.CategoryMapper;
import com.jiawa.wiki.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
