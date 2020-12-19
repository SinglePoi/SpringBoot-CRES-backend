package com.gproject.service;

import com.gproject.entity.Notice;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-11-18
 */
public interface INoticeService extends IService<Notice> {

//    List<Notice> findAll();

    void add(Notice notice);

    void update(Notice notice);

    List<Notice> selectByPage(Integer page, Integer size);

    Long findTotals();
}
