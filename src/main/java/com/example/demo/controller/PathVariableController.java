package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

//  SYNTAX :  @RequestMapping("/{Pathvariable_name")
    @RequestMapping("/msg/{name}")
    public String hello(@PathVariable String name){

      return "Welcome to Path Variable "+name;
    }

    @RequestMapping("/check_age/{age}")
    public String checkAge(@PathVariable int age){
        if(age>18){

            return "Person is Young ";

        } else {
            return "Person is Child ";
        }
    }

    @RequestMapping("/check_salary/{salary}")
    public String checkSalary(@PathVariable double salary){

        if (salary>50000.0){

           return "Your PACKAGE is good";
        }
        else {
            return "Your PACKAGE is Average";
        }
    }

}
