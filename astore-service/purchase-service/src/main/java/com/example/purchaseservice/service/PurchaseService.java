package com.example.purchaseservice.service;

import com.example.purchaseservice.entity.Purchase;

public interface PurchaseService {

    Purchase recordPurchase(Long userId, Long applicationId);

    String generateDownloadLink(Long applicationId);
}

