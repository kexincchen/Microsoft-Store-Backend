package com.example.purchaseservice.service.impl;


import com.example.purchaseservice.entity.DistributionRecord;
import com.example.purchaseservice.mapper.DistributionRecordMapper;
import com.example.purchaseservice.service.DistributionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DistributionRecordServiceImpl implements DistributionRecordService {
    private final DistributionRecordMapper distributionRecordMapper;

    @Autowired
    public DistributionRecordServiceImpl(DistributionRecordMapper distributionRecordMapper) {
        this.distributionRecordMapper = distributionRecordMapper;
    }

    public boolean validateToken(String token) {
        // 示例逻辑：查找token，检查是否过期等
        DistributionRecord record = distributionRecordMapper.findByToken(token);
        if (record != null && record.getValidUntil().after(new Date())) {
            return true;
        }
        return false;
    }

    // 标记token为已使用或删除token等操作
    public void markTokenAsUsed(String token) {
        int updatedRows = distributionRecordMapper.markTokenAsUsed(token);
        if (updatedRows == 0) {
            // 处理token已被使用或不存在的情况
            System.out.println("ERROR: NO Token exists OR it has been USED. ");
        }
    }
}
