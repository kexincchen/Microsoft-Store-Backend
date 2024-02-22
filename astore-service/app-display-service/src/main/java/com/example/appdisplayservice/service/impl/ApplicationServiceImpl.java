package com.example.appdisplayservice.service.impl;

import com.example.appdisplayservice.AppDisplayServiceApplication;
import com.example.appdisplayservice.mapper.ApplicationMapper;
import com.example.appdisplayservice.service.ApplicationService;
import org.springframework.stereotype.Service;
import com.example.appdisplayservice.entity.Application;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final ApplicationMapper applicationMapper;

    public ApplicationServiceImpl(ApplicationMapper applicationMapper) {
        this.applicationMapper = applicationMapper;
    }

    public List<Application> listAllApplications() {
        return applicationMapper.selectList(null);
    }


}

