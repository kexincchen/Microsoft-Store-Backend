package com.example.appservice.service.impl;

import com.example.appservice.mapper.ApplicationMapper;
import com.example.appservice.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.appservice.entity.Application;
import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationMapper applicationMapper;

    @Override
    @Cacheable(value = "allApplications")
    public List<Application> listAllApplications() {
        return applicationMapper.selectList(null);
    }

    @Override
    @Cacheable(value = "applicationsByName", key = "#name")
    public List<Application> searchApplicationsByName(String name) {
        return applicationMapper.searchByName(name);
    }

    // Add application: @CachePut(value = "appDetails", key = "#application.id")
    // Delete application: @CacheEvict(value = "appDetails", key = "#appId")
}

