package com.example.userservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.userservice.entity.UserActivity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserActivityMapper extends BaseMapper<UserActivity> {
    // Additional queries can be defined here
}

