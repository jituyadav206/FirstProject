package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public String hello(){
        return "welcome to jenkins";
    }
}
