//package com.gproject.controller;
//
//import com.gproject.entity.UserTable;
//import com.gproject.service.IUserTableService;
//import com.gproject.utils.JwtUtils;
//import com.gproject.vo.LoginVO;
//import com.gproject.vo.Result;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authz.annotation.RequiresAuthentication;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.Assert;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import cn.hutool.core.map.MapUtil;
//import cn.hutool.crypto.SecureUtil;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//
//import javax.servlet.http.HttpServletResponse;
//
//@RestController
//public class AccountController {
//
//    @Autowired
//    IUserTableService userService;
//
//    @Autowired
//    JwtUtils jwtUtils;
//
//    @PostMapping("/login")
//    public Result login(@Validated @RequestBody LoginVO loginVO, HttpServletResponse response) {
//
//        UserTable user = userService.getOne(new QueryWrapper<UserTable>().eq("username", loginVO.getUsername()));
//        Assert.notNull(user, "用户不存在");
//
//        if (!user.getPassword().equals(SecureUtil.md5(loginVO.getPassword()))) {
//            return Result.fail("密码不正确");
//        }
//        String jwt = jwtUtils.generateToken(user.getId());
//
//        response.setHeader("Authorization", jwt);
//        response.setHeader("Access-control-Expose-Headers", "Authorization");
//
//        return Result.succe(MapUtil.builder()
//                .put("id", user.getId())
//                .put("username", user.getUsername())
//                .put("phone", user.getPhone())
//                .put("email", user.getEmail())
//                .map()
//        );
//    }
//
//    @RequiresAuthentication
//    @GetMapping("/logout")
//    public Result logout() {
//        SecurityUtils.getSubject().logout();
//        return Result.succe(null);
//    }
//}
