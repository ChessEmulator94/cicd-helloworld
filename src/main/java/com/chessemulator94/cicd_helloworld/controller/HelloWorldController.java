package com.chessemulator94.cicd_helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloWorldController {

    @GetMapping("/generic_greeting")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/greet_me")
    public String getHelloPerson(@RequestParam String name) {
        return "Hello World Master " + name;
    }
    
    // Comment to test jenkins connection

    @GetMapping("/")
    public String getHomeScreen() {
        return "Welcome Home";
    }
    
}