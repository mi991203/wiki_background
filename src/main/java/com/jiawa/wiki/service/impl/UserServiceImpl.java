package com.jiawa.wiki.service.impl;

import com.jiawa.wiki.entity.User;
import com.jiawa.wiki.mapper.UserMapper;
import com.jiawa.wiki.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-12-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
