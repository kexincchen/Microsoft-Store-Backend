package com.example.purchaseservice.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.purchaseservice.entity.Purchase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseMapper extends BaseMapper<Purchase> {
    // Custom queries can be added here if needed
}

