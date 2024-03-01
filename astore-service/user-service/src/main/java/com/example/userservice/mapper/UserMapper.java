package com.example.userservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.userservice.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    // Additional queries can be added here
}
