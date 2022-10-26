package com.spring.guides.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModelViewController {

    @GetMapping("/mvc")
    public String home() {
        return "This is a MVC GetMapping";
    }
}
