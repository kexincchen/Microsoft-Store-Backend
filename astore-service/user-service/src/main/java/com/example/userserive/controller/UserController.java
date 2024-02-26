package com.example.userserive.controller;


import com.example.userserive.entity.User;
import com.example.userserive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/activity")
    public void logActivity(@RequestParam Long userId, @RequestParam String activityType, @RequestParam String details) {
        userService.recordActivity(userId, activityType, details);
    }

    // Additional endpoints for user management
}

