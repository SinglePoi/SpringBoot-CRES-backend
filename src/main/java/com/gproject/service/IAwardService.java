package com.gproject.service;

import com.gproject.entity.Award;
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
public interface IAwardService extends IService<Award> {
    List<Award> findAll();
}
