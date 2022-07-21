package com.csis3275.pwa.controller;


import com.csis3275.pwa.model.Advisor;
import com.csis3275.pwa.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdvisorController {

    @Autowired
    AdvisorRepository advisorRepository;

    //    Get Advisors
    @GetMapping("/advisors")
    public List<Advisor> getAllAdvisors() {
            return advisorRepository.findAll();
    }


    //    Add Advisors
    @PostMapping("/advisors")
    public void addAdvisors(@RequestBody final List<Advisor> advisors) {
        advisorRepository.saveAll(advisors);
    }
}
