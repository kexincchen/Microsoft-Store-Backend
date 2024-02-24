package com.example.appdisplayservice.service.impl;

import com.example.appdisplayservice.mapper.ApplicationMapper;
import com.example.appdisplayservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.appdisplayservice.entity.Application;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationMapper applicationMapper;

    public List<Application> listAllApplications() {
        return applicationMapper.selectList(null);
    }


}

