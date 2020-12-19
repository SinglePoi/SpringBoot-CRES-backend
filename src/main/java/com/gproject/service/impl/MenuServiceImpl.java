package com.gproject.service.impl;

import com.gproject.entity.Menu;
import com.gproject.mapper.MenuMapper;
import com.gproject.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-12-07
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findAll(Menu menu) {
        return menuMapper.findAll(menu);
    }

//    @Override
//    public Menu findParent() {
//        return menuMapper.findParent();
//    }
//
//    @Override
//    public List<Menu> findChildren() {
//        return menuMapper.findChildren();
//    }
}
