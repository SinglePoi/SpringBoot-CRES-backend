package com.gproject.service;

import com.gproject.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-12-07
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> findAll(Menu menu);

//    Menu findParent();
//    List<Menu> findChildren();
}
