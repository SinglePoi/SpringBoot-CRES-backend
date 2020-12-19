package com.gproject.mapper;

import com.gproject.entity.Competition;
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
public interface CompetitionMapper extends BaseMapper<Competition> {

    @Select("select * from competition")
    List<Competition> findAll();

}
