package com.gproject.controller;


import com.gproject.entity.Award;
import com.gproject.service.IAwardService;
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
@RequestMapping("/award")
public class AwardController {

    @Autowired
    private IAwardService awardService;

    @GetMapping("/all")
    public List<Award> all(){
        return awardService.findAll();
    }
}
