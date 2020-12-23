package com.gproject.service;

import com.gproject.entity.UserTable;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-12-22
 */
public interface IUserTableService extends IService<UserTable> {

    void saveUser(UserTable notice);
}
