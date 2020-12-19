package com.gproject.service;

import com.gproject.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-12-01
 */
public interface IUserService extends IService<User> {

    User login(User user);
}
