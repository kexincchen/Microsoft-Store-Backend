package com.example.purchaseservice.service;

public interface DistributionRecordService {
    boolean validateToken(String token);
    void markTokenAsUsed(String token);
}
