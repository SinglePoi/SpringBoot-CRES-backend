package com.gproject.service.impl;

import com.gproject.entity.Competition;
import com.gproject.mapper.CompetitionMapper;
import com.gproject.service.ICompetitionService;
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
public class CompetitionServiceImpl extends ServiceImpl<CompetitionMapper, Competition> implements ICompetitionService {

    @Autowired
    private CompetitionMapper competitionMapper;

    @Override
    public List<Competition> findAll() {
        return competitionMapper.findAll();
    }
}
