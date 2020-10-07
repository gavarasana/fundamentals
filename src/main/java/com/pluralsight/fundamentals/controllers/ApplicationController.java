package com.pluralsight.fundamentals.controllers;

import com.pluralsight.fundamentals.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/applications")
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @GetMapping()
    public String getAllApplications(Model model){
        model.addAttribute("applications", service.getAllApplications());
        return "applications";
    }
}
