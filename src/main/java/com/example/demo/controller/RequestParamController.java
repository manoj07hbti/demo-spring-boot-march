package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/request_param_message")
    public String hello(@RequestParam String name){

        return "Welcome to Request Param : "+name;
    }

    @RequestMapping("/division")
    public String marks(@RequestParam int marks){

        if(marks >75){

            return "First Division..";
        }
        else
        {
            return "Second division....";
        }
    }

}
