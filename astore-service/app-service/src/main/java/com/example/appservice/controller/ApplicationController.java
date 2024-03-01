package com.example.appservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.appservice.entity.Application;
import com.example.appservice.service.ApplicationService;

import java.time.LocalDate;
import java.util.Date;
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
        return ResponseEntity.ok(applications.toString());
//        return ResponseEntity.ok(" I AM GOOD");
    }

    @GetMapping("/search")
    public List<Application> searchApplications(@RequestParam String name) {
        return applicationService.searchApplicationsByName(name);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addApplication(@RequestParam String name) {
        Application application = new Application();
        application.setName(name);
        application.setReleaseDate(LocalDate.now());
        applicationService.addApplication(application);
        return ResponseEntity.status(HttpStatus.CREATED).body("Application added successfully");
    }


}
