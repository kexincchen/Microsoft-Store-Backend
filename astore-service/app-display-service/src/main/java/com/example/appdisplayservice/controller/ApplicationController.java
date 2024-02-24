package com.example.appdisplayservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.appdisplayservice.entity.Application;
import com.example.appdisplayservice.service.ApplicationService;
import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/all")
    public ResponseEntity<String> getAllApplications() {

        List<Application> applications = applicationService.listAllApplications();
        System.out.println(applications);
//        return ResponseEntity.ok(applications.toString());
        return ResponseEntity.ok(" I AM GOOD");
    }


}
