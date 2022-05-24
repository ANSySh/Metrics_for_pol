package com.example.crashmetrics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController{

    @GetMapping("/items")
    public String items(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return "Hello " + name;
    }

}