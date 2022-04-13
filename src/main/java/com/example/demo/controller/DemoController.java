package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //ENDPOINT 1
    @RequestMapping("/hello")
    public void message(){

        System.out.println("Hello , Welcome to Spring Boot..");
    }

    @RequestMapping("/message")
    public String hello(){

       return "This is my first Spring Boot App";
    }

    @RequestMapping("/int")
    public int returnInteger(){

        return 33;
    }

}
