package com.example.appservice.service;

import com.example.appservice.entity.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> listAllApplications();

    List<Application> searchApplicationsByName(String name);

    void addApplication(Application application);
}
