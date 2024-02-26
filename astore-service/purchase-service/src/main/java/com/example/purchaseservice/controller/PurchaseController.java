package com.example.purchaseservice.controller;

import com.example.purchaseservice.entity.Purchase;
import com.example.purchaseservice.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping("/")
    public String purchaseApp(@RequestParam Long userId, @RequestParam Long applicationId) {
        Purchase purchase = purchaseService.recordPurchase(userId, applicationId);
        if (purchase != null) {
            String downloadLink = purchaseService.generateDownloadLink(applicationId);
            return "Purchase successful. Download link: " + downloadLink;
        } else {
            return "Purchase failed.";
        }
    }
}

