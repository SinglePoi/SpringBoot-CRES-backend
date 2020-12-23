package com.gproject.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gproject.entity.College;
import com.gproject.entity.UserTable;
import com.gproject.enums.UserTypeEnum;
import com.gproject.handler.BusinessException;
import com.gproject.mapper.CollegeMapper;
import com.gproject.mapper.UserTableMapper;
import com.gproject.service.IUserTableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gproject.vo.ResultCode;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-12-22
 */
@Service
public class UserTableServiceImpl extends ServiceImpl<UserTableMapper, UserTable> implements IUserTableService {

    @Autowired
    private CollegeMapper collegeMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public void saveUser(UserTable user) {
        //判断是否增加了同一个用户
        String username = user.getUsername();
        //获取学院
        Integer collegeId = user.getCollegeId();
        QueryWrapper<UserTable> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        Integer count = this.baseMapper.selectCount(wrapper);
        if(count!=0){
            throw new BusinessException(ResultCode.USER_ACCOUNT_ALREADY_EXIST.getCode(),
                    ResultCode.USER_ACCOUNT_ALREADY_EXIST.getMsg());
        }
        College college = collegeMapper.selectById(collegeId);
        if(college==null){
            throw new BusinessException(ResultCode.COLLEGE_NOT_EXIST.getCode(),
                    ResultCode.COLLEGE_NOT_EXIST.getMsg());
        }
//        String salt = UUID.randomUUID().toString().substring(0,32);
//        user.setSalt(salt);
//        没有设置创建时间和更新时间  使用mybatis-plus的自动填充功能实现
        user.setCreatTime(new Date());
        user.setUpdateTime(new Date());
        //使用spring security自带的密码加密策略
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        //用户类型
        user.setRoleId(UserTypeEnum.SYSTEM_STU.getTypeCode());
        //设置状态
//        user.setStatus(UserStatusEnum.AVAILABLE.getStatusCode());
        //设置是否删除
//        user.setDeleted(false);
        this.baseMapper.insert(user);
    }
}
