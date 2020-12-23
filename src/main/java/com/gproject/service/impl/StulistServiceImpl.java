package com.gproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gproject.entity.College;
import com.gproject.entity.Notice;
import com.gproject.entity.Stulist;
import com.gproject.handler.BusinessException;
import com.gproject.mapper.CollegeMapper;
import com.gproject.mapper.StulistMapper;
import com.gproject.service.IStulistService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gproject.vo.ResultCode;
import com.gproject.vo.StuListOV;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-12-06
 */
@Service
public class StulistServiceImpl extends ServiceImpl<StulistMapper, Stulist> implements IStulistService {

    @Autowired
    private StulistMapper stulistMapper;

    @Override
    public List<Stulist> all() {
        return stulistMapper.all();
    }

    @Override
    public Stulist selectById(long id) {
        return stulistMapper.selectById(id);
    }

    @Override
    public List<Stulist> college() {
        return stulistMapper.college();
    }

    @Override
    public IPage<Stulist> findStuPage(Page<Stulist> page, QueryWrapper<Stulist> wrapper) {
        return this.stulistMapper.findStuPage(page, wrapper);
    }

    @Override
    public void insert(Stulist stulist) {

    }

}
