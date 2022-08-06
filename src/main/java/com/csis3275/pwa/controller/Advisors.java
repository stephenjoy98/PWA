package com.csis3275.pwa.controller;

import com.csis3275.pwa.model.Advisor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Controller
public class Advisors {

    @GetMapping("/advisors")
    public String index(Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/api/advisors";

        Advisor[] advisors = restTemplate.getForObject(url, Advisor[].class);
        model.addAttribute("advisors", advisors);
        model.addAttribute("selectValue", 0);
        return "advisors";
    }

    @CrossOrigin
    @PostMapping  ("/advisorsByRating/{rating}")
    public String advisorsByRating(@PathVariable final String rating, Model model) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/api/advisors/rating/" + rating;

        Advisor[] advisors = restTemplate.getForObject(url, Advisor[].class);
        model.addAttribute("advisors", advisors);
        model.addAttribute("selectValue", rating);

        return "advisors";
    }
}
