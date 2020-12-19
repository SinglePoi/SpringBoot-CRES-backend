package com.gproject.controller;


import com.gproject.entity.Team;
import com.gproject.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-24
 */
@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private ITeamService teamService;

    @GetMapping("/all")
    public List<Team> findAll(){
        return teamService.findAll();
    }
}
