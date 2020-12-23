package com.gproject.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gproject.entity.UserTable;
import com.gproject.service.IUserTableService;
import com.gproject.vo.Result;
import com.gproject.vo.UserVO;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-12-22
 */
@RestController
@RequestMapping("/user-table")
public class UserTableController {

    @Autowired
    IUserTableService userService;
    /**
     * 封装查询条件
     *
     * @param userVO
     * @return
     */
    private QueryWrapper<UserTable> getWrapper(UserVO userVO) {
        QueryWrapper<UserTable> queryWrapper = new QueryWrapper<>();
        if (userVO != null) {
            if (!StringUtils.isEmpty(userVO.getCollegeId())) {
                queryWrapper.eq("college_id", userVO.getCollegeId());
            }
            if (!StringUtils.isEmpty(userVO.getUsername())) {
                queryWrapper.eq("username", userVO.getUsername());
            }
            if (!StringUtils.isEmpty(userVO.getEmail())) {
                queryWrapper.eq("email", userVO.getEmail());
            }
            if (!StringUtils.isEmpty(userVO.getGender())) {
                queryWrapper.eq("gender", userVO.getGender());
            }
            if (!StringUtils.isEmpty(userVO.getName())) {
                queryWrapper.eq("name", userVO.getName());
            }
        }
        return queryWrapper;
    }

    @ApiOperation(value = "添加用户",notes = "添加用户信息")
    @PostMapping("/adduser")
    public Result addUser(@RequestBody UserTable user){
        try{
            userService.saveUser(user);
            return Result.succe();
        }catch (Exception e){
            return Result.error();
        }
    }
}
