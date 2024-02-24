package com.example.reviewservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reviewservice.entity.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReviewMapper extends BaseMapper<Review> {
    @Select("SELECT * FROM reviews WHERE application_id = #{applicationId}")
    List<Review> findByApplicationId(@Param("applicationId") Long applicationId);
}

