package com.example.JenkinsApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String home(){
        return "Welcome to home";
    }
    @GetMapping("/route1")
    public String route1(){
        return "<h1>Welcome to route1</h1>";
    }

}
