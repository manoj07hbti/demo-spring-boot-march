package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    //add

    @RequestMapping("/add/{a}/{b}")
    public String addition(@PathVariable int a, @PathVariable int b){

        return  "Addition is: "+(a+b) ;
    }

    @RequestMapping("add_request_param")
    public String add_method(@RequestParam int a,@RequestParam int b){

        return "Addition is :"+(a+b);
    }

    //sub
    @RequestMapping("/sub")
    public String subtraction(){
        int a=45;
        int b=33;

       return  "Subtraction is: "+(a-b);
    }

    //divide   (a/b)
    //multi    (a*b)
}
