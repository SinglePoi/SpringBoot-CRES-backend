package com.gproject.mapper;

import com.gproject.entity.Notice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-11-18
 */
public interface NoticeMapper extends BaseMapper<Notice> {

//@Select("select * from notice")
//    @Select("select n.id,n.notice_title,n.grade,n.startdate,n.notice_file,n.notice_state,c.classify_name" +
//            "from notice n, competition_class c, college cg" +
//            "where n.competition_class = c.classify_id")
//    List<Notice> findAll();

    @Insert("insert into notice(notice_title,competition_class,competition_type,grade," +
            "college,longtime,notice_content) values(" +
            "#{noticeTitle}, #{competitionClass}, #{competitionType}, #{grade}," +
            " #{college}, #{longtime}, #{noticeContent})")
    void add(Notice notice);

    @Update("update notice set notice_title=#{noticeTitle}, competition_class=#{competitionClass}, competition_type=#{competitionType}," +
            "grade=#{grade}, college=#{college}, longtime=#{longtime}, notice_content=#{noticeContent}" +
            " where id = #{id}")
    void update(Notice notice);

//    @Select("select * from notice limit #{start},#{rows}")
    @Select("select n.notice_id,n.notice_title,n.grade,n.startdate,n.notice_state,n.college,c.classify_name,n.competition_type" +
            " from notice n, competition_class c" +
            " where n.competition_class = c.classify_id" +
            " limit #{start},#{rows}")
//    List<Notice> findAll();
    List<Notice> selectByPage(@Param("start") Integer start, @Param("rows") Integer rows);

    @Select("select count(notice_id) from notice")
    Long findTotals();

}
