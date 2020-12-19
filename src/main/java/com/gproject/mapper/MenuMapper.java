package com.gproject.mapper;

import com.gproject.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-12-07
 */
public interface MenuMapper extends BaseMapper<Menu> {
    @Select("SELECT * from menu")
    List<Menu> findAll(Menu maintree);

//    @Select("select * from menu where parent_id is null")
//    Menu findParent();
//
//    @Select("select * from menu\n" +
//            "WHERE parent_id = #{my_id}")
//    List<Menu> findChildren(Integer myId);
}
