package com.example.Spring.Boot.Prectice.Spring.Boot.Prectice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring
{
    @GetMapping("/")
    public String hello(){
        return "Hello Rutvik Welcome to the Spring Boot!";
    }
}
