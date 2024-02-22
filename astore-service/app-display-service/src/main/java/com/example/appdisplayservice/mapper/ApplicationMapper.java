package com.example.appdisplayservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.appdisplayservice.entity.Application;

@Mapper
public interface ApplicationMapper extends BaseMapper<Application> {
}

