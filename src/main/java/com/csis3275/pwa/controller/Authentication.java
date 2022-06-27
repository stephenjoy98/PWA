package com.csis3275.pwa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Authentication {
    @GetMapping("/")
    public String index() {
        return "landing-page";
    }
}
