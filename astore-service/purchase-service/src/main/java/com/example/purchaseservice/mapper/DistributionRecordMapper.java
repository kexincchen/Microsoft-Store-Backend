package com.example.purchaseservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.purchaseservice.entity.DistributionRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DistributionRecordMapper extends BaseMapper<DistributionRecord> {
    // Additional queries can be defined here if needed

    @Select("SELECT * FROM distribution_records WHERE token = #{token}")
    DistributionRecord findByToken(@Param("token") String token);

    @Update("UPDATE distribution_records SET used = 1 WHERE token = #{token} AND used = 0")
    int markTokenAsUsed(@Param("token") String token);
}

