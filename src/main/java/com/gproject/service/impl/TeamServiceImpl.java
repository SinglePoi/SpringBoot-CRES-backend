package com.gproject.service.impl;

import com.gproject.entity.Competition;
import com.gproject.entity.Team;
import com.gproject.mapper.CompetitionMapper;
import com.gproject.mapper.NoticeMapper;
import com.gproject.mapper.TeamMapper;
import com.gproject.service.ITeamService;
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
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team> implements ITeamService {
    @Autowired
    private TeamMapper teamMapper;

    @Override
    public List<Team> findAll() {
        return teamMapper.findAll();
    }
}
