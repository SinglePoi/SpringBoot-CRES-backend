package com.gproject.service.impl;

import com.gproject.entity.User;
import com.gproject.mapper.UserMapper;
import com.gproject.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-12-01
 */
@Service
//@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User login(User user) {
        User login = userMapper.login(user);
        if(login!=null){
            return login;
        }
        throw new RuntimeException("登录失败");
    }
}
