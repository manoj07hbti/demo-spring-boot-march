package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    //add

    @RequestMapping("/add")
    public String addition(){

        int a=6;
        int b=3;

        return  "Addition is: "+(a+b) ;
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
