package com.example.demoautomation;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    @RequestMapping("/")
    public String greeting() {
        return "Hello Heroku";
    }
}
