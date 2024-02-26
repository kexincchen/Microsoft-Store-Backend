package com.example.purchaseservice.service;

import com.example.purchaseservice.entity.Purchase;

public interface PurchaseService {

    String recordPurchaseAndGenerateToken(Long userId, Long applicationId);

    String generateDownloadLink(Long applicationId);
}

