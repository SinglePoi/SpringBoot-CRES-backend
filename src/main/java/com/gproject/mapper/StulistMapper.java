package com.gproject.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gproject.entity.Notice;
import com.gproject.entity.Stulist;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gproject.vo.StuListOV;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.yaml.snakeyaml.constructor.Construct;
import org.yaml.snakeyaml.scanner.Constant;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-12-06
 */
public interface StulistMapper extends BaseMapper<Stulist> {

    @Select("select * from stulist")
//    @Select("select s.id,s.student_id,s.gender,s.student_name,c.college_name" +
//            " from college c, stulist s" +
//            " where s.college_id = c.college_id")
    List<Stulist> all();

    @Select("select * from stulist where id = #{id}")
    Stulist selectById(long id);

    @Select("SELECT c.college_name," +
            " IFNULL((SELECT count(*) from stulist s where s.college_id = c.college_id\n" +
            " GROUP BY college_id),0)" +
            " AS count from college c")
    List<Stulist> college();

    @Select("select s.id,s.student_id,s.student_name,c.college_name,s.gender" +
            " from stulist s" +
            " INNER JOIN college c" +
            " on s.college_id=c.college_id" +
            " ${ew.customSqlSegment}")
    IPage<Stulist> findStuPage(Page<Stulist> page,@Param(Constants.WRAPPER) QueryWrapper<Stulist> wrapper);


//    IPage<Stulist> findStuPage(Page<Stulist> page, @Param(Constants.WRAPPER) QueryWrapper<Stulist> wrapper);

//    @Select("insert into stulist values(#{id}, #{studentId}, #{studentName}, #{collegeId}, #{gender}, null," +
//            " #{gender})")
//    int insert(Stulist stulist);
}
