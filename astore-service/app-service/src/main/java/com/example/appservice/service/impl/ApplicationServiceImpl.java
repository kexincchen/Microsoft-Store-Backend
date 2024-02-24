package com.example.appservice.service.impl;

import com.example.appservice.mapper.ApplicationMapper;
import com.example.appservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.appservice.entity.Application;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationMapper applicationMapper;

    public List<Application> listAllApplications() {
        return applicationMapper.selectList(null);
    }

    @Override
    public List<Application> searchApplicationsByName(String name) {
        return applicationMapper.searchByName(name);
    }


}

