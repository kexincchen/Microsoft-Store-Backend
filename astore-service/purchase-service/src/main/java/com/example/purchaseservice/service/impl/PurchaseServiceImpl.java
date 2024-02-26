package com.example.purchaseservice.service.impl;

import com.example.purchaseservice.entity.DistributionRecord;
import com.example.purchaseservice.entity.Purchase;
import com.example.purchaseservice.mapper.DistributionRecordMapper;
import com.example.purchaseservice.mapper.PurchaseMapper;
import com.example.purchaseservice.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    private final PurchaseMapper purchaseMapper;
    private final DistributionRecordMapper distributionRecordMapper;

    @Autowired
    public PurchaseServiceImpl(PurchaseMapper purchaseMapper, DistributionRecordMapper distributionRecordMapper) {
        this.purchaseMapper = purchaseMapper;
        this.distributionRecordMapper = distributionRecordMapper;
    }

//    public Purchase recordPurchase(Long userId, Long applicationId) {
//        Purchase purchase = new Purchase();
//        purchase.setUserId(userId);
//        purchase.setApplicationId(applicationId);
//        purchase.setPurchaseDate(new Date());
//        purchaseMapper.insert(purchase);
//        return purchase;
//    }

    public String generateDownloadLink(Long applicationId) {
        // Implement logic to generate a unique download link for the application
        // This is a placeholder implementation
        return "http://example.com/download/" + applicationId;
    }

    public String recordPurchaseAndGenerateToken(Long userId, Long applicationId) {
        Purchase purchase = new Purchase();
        purchase.setUserId(userId);
        purchase.setApplicationId(applicationId);
        purchase.setPurchaseDate(new Date());
        purchaseMapper.insert(purchase);

        DistributionRecord distributionRecord = new DistributionRecord();
        distributionRecord.setPurchaseId(purchase.getId());
        distributionRecord.setToken(UUID.randomUUID().toString());
        distributionRecord.setValidUntil(generateValidityDate());
        distributionRecordMapper.insert(distributionRecord);

        return distributionRecord.getToken();
    }

    private Date generateValidityDate() {
        // Example: Set token validity for 24 hours from now
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, 24);
        return calendar.getTime();
    }

}
