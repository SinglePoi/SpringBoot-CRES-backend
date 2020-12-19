package com.gproject.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gproject.entity.Notice;
import com.gproject.entity.Stulist;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gproject.vo.StuListOV;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-12-06
 */
public interface IStulistService extends IService<Stulist> {

    List<Stulist> all();

    Stulist selectById(long id);

    List<Stulist> college();

    IPage<Stulist> findStuPage(Page<Stulist> page,QueryWrapper<Stulist> wrapper);
}
