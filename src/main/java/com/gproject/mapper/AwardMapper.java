package com.gproject.mapper;

import com.gproject.entity.Award;
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
public interface AwardMapper extends BaseMapper<Award> {

    @Select("select c.college_name,cc.classify_name,co.competition_type,co.competition_name" +
            ",a.teacher,a.award_time,a.award_name,a.award_id"+
            " from college c,award a,competition co,competition_class cc" +
            " where c.college_id=a.college_id" +
            " and a.competition_id = co.competition_id" +
            " and co.competition_class = cc.classify_id")
    List<Award> findAll();
}
