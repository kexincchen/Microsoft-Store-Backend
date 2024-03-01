package com.example.userservice.service;

import com.example.userservice.entity.User;


public interface UserService {
    User createUser(User user);

    void recordActivity(Long userId, String activityType, String details);
}
