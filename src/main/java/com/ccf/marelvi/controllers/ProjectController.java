package com.ccf.marelvi.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
    

    @PostMapping("/create")
    public String createProject() {
        return "First endpoint";
    }
}
