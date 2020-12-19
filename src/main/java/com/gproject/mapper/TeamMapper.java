package com.gproject.mapper;

import com.gproject.entity.Competition;
import com.gproject.entity.Team;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-11-24
 */
public interface TeamMapper extends BaseMapper<Team> {

    @Select("select * from team")
    List<Team> findAll();
}
