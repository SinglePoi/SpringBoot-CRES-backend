package com.gproject.service.impl;

import com.gproject.entity.College;
import com.gproject.mapper.CollegeMapper;
import com.gproject.service.ICollegeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-12-23
 */
@Service
public class CollegeServiceImpl extends ServiceImpl<CollegeMapper, College> implements ICollegeService {

}
