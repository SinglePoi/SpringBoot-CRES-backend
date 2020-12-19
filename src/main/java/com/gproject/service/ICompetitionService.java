package com.gproject.service;

import com.gproject.entity.Competition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gproject.entity.Team;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2020-11-24
 */
public interface ICompetitionService extends IService<Competition> {

    List<Competition> findAll();
}
