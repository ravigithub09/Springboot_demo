package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeAPI {

    @GetMapping("/user")
    public String welcomeUser(){
        return "Welcome user!!";
    }
}
