package com.pluralsight.fundamentals.controllers.api;

import com.pluralsight.fundamentals.entities.Application;
import com.pluralsight.fundamentals.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationApiController {

    @Autowired
    private ApplicationService service;

    @GetMapping
    public ResponseEntity<List<Application>> getAllApplications(){
        return new ResponseEntity<List<Application>>(service.getAllApplications(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    //@RequestMapping("/{id}")
    public ResponseEntity<Application> getApplicationById(@PathVariable Integer id){
        Application application = service.getApplicationById(id);
        if (application == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Application not found");
        }
        return new ResponseEntity<Application>(application, HttpStatus.OK);
    }


}
