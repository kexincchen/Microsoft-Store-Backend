package com.example.userservice.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@TableName("user_activities")
@NoArgsConstructor
public class UserActivity {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long userId;
    private String activityType;
    private Date activityDate;
    private String details;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
