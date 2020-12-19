package com.gproject.mapper;

import com.gproject.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-12-01
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from user where user_name=#{userName} and password=#{password}")
    User login(User user);

}
