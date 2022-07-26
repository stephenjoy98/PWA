package com.csis3275.pwa.controller;


import com.csis3275.pwa.model.Advisor;
import com.csis3275.pwa.repository.AdvisorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdvisorController {

    @Autowired
    AdvisorRepository advisorRepository;

    @GetMapping("/api/advisors")
    public List<Advisor> getAllAdvisors() {
            return advisorRepository.findAll();
    }

    @GetMapping("/api/advisors/rating/{rating}")
    public List<Advisor> getAdvisorsByRating(@PathVariable final String rating) {
        return advisorRepository.getAdvisorsByRating(rating);
    }


    @PostMapping("/api/advisors")
    public void addProducts(@RequestBody final List<Advisor> advisors) {
        advisorRepository.saveAll(advisors);
    }

}
