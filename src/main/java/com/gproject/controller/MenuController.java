package com.gproject.controller;


import com.baomidou.mybatisplus.extension.api.R;
import com.gproject.entity.Menu;
import com.gproject.entity.TreeNode;
import com.gproject.service.IMenuService;
import com.gproject.vo.MenuResult;
import com.gproject.vo.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-12-07
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private IMenuService menuService;

//    @GetMapping
//    @ApiOperation(value = "左侧导航栏信息", notes = "查询导航栏信息")
//    public MenuResult findAll(){
//        List<Menu> parentList =
//        List<Menu> children= new ArrayList<>();
//        children = menuService.findChildren();
//        List<Menu> router= menuService.findAll();
//
//        Map<String,Object> map = new HashMap<>();
//        map.put("children", children);
//        map.put("router", router);
//        MenuResult menuResult = new MenuResult();
//        menuResult.setChildren(map);
//        return menuResult;
//    }

    /**
     * 菜单树
     */
    @CrossOrigin(origins = "*")
    @RequestMapping("/findTree")
    @ApiOperation(value = "树形数据信息", notes = "查询导航栏信息")
    @ResponseBody
    public Result findTree() {
            Menu menu = new Menu();
            // 直接调用
            // 原始的数据
            List<Menu> rootMenu = menuService.findAll(menu);
            // 构建好的菜单树，第一层菜单的pid是null
            List<Menu> menuTree = buildMenuTree(rootMenu, null);
            Result r = Result.succe(menuTree);
//            Result result = new Result();
//            result.setData(menuTree);
            return r;

    }

    /**
     * 递归查找子菜单
     *
     *            当前菜单id
     *            要查找的列表
     *
     *            pid 为父级id 也就是当前的 H_uuid
     *            M_uuid 为数的节点也就是唯一标识UUID
     *
     *
     * @return
     */
    private List<Menu> buildMenuTree(List<Menu> menuList, Integer pid) {
        List<Menu> treeList = new ArrayList<>();
        menuList.forEach(menu -> {
            if (Objects.equals(pid, menu.getParentId())) {
                menu.setChildren(buildMenuTree(menuList,menu.getMyId()));
                treeList.add(menu);
            }
        });
        return treeList;
    }
}
