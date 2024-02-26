package com.example.userserive.service.impl;

import com.example.userserive.entity.User;
import com.example.userserive.entity.UserActivity;
import com.example.userserive.mapper.UserActivityMapper;
import com.example.userserive.mapper.UserMapper;
import com.example.userserive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserActivityMapper userActivityMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserActivityMapper userActivityMapper) {
        this.userMapper = userMapper;
        this.userActivityMapper = userActivityMapper;
    }

    public User createUser(User user) {
        user.setRegistrationDate(new Date());
        userMapper.insert(user);
        return user;
    }

    public void recordActivity(Long userId, String activityType, String details) {
        UserActivity activity = new UserActivity();
        activity.setUserId(userId);
        activity.setActivityType(activityType);
        activity.setActivityDate(new Date());
        activity.setDetails(details);
        userActivityMapper.insert(activity);
    }

    // Additional user-related methods
}

