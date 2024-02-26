package com.example.purchaseservice.controller;

import com.example.purchaseservice.service.DistributionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/download")
public class DownloadController {
    @Autowired
    private DistributionRecordService distributionRecordService;

    @GetMapping("/{token}")
    public ResponseEntity<?> downloadApplication(@PathVariable String token) {
        if (distributionRecordService.validateToken(token)) {
            distributionRecordService.markTokenAsUsed(token);
            // 假设这里直接返回一个下载链接
            // 实际应用中，重定向用户到实际的文件下载地址，或者以其他方式提供文件
            String downloadUrl = "http://example.com/path/to/your/application.apk";
            return ResponseEntity.ok().body(Map.of("downloadUrl", downloadUrl));
        } else {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Invalid or expired download token.");
        }
    }
}
