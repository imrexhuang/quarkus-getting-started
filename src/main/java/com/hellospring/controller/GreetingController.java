package com.hellospring.controller;

// https://quarkus.io/guides/spring-web

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//http://localhost:8080/springgreeting
@RequestMapping("/springgreeting")
public class GreetingController {
    @GetMapping
    public String hello() {
        return "hello Spring";
    }    
}
