package com.example.userserive.service;

import com.example.userserive.entity.User;


public interface UserService {
    User createUser(User user);

    void recordActivity(Long userId, String activityType, String details);
}
