package com.pluralsight.fundamentals.services;

import com.pluralsight.fundamentals.entities.Application;
import com.pluralsight.fundamentals.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    public List<Application> getAllApplications(){
        return repository.findAll();
    }

    public Application getApplicationById(Integer id) {
        return repository.getOne(id);
    }
}
