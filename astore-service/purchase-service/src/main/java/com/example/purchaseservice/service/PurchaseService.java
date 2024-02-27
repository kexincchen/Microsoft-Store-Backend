package com.example.purchaseservice.service;

public interface PurchaseService {


    String recordPurchaseAndGenerateToken(Long userId, Long applicationId);

    String generateDownloadLink(Long applicationId);
}

