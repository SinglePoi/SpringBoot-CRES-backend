package com.gproject.controller;


import com.gproject.entity.User;
import com.gproject.service.IUserService;
import com.gproject.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-12-01
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/login")
    public Result login(User user){
        User user1 = userService.login(user);
        return Result.succe(user1);
    }
}
