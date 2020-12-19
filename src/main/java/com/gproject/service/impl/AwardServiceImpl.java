package com.gproject.service.impl;

import com.gproject.entity.Award;
import com.gproject.mapper.AwardMapper;
import com.gproject.service.IAwardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-11-24
 */
@Service
public class AwardServiceImpl extends ServiceImpl<AwardMapper, Award> implements IAwardService {

    @Autowired
    private AwardMapper awardMapper;
    @Override
    public List<Award> findAll() {
        return awardMapper.findAll();
    }
}
