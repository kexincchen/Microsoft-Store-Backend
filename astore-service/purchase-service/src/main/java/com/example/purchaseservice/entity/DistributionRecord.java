package com.example.purchaseservice.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@TableName("distribution_records")
@NoArgsConstructor
public class DistributionRecord {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long purchaseId;
    private String token;
    private Date validUntil;
    private Boolean used;

    public void setId(Long id) {
        this.id = id;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }
}
