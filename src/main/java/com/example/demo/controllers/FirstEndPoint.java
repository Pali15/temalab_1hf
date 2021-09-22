package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstEndPoint {

    @GetMapping("/hello")
    public String first(){
        return "Hello";
    }
}
