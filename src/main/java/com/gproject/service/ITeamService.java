package com.gproject.service;

import com.gproject.entity.Competition;
import com.gproject.entity.Team;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-11-24
 */
public interface ITeamService extends IService<Team> {
    List<Team> findAll();
}
