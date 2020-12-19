package com.gproject.controller;


import com.gproject.entity.Competition;
import com.gproject.mapper.CompetitionMapper;
import com.gproject.service.ICompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletionService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-11-24
 */
@RestController
@RequestMapping("/competition")
public class CompetitionController {

    @Autowired
    private ICompetitionService competitionService;


    @GetMapping("/all")
    public List<Competition> all(){
        return competitionService.findAll();
    }
}
