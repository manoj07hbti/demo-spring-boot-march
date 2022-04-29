package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDBController {

    @Autowired
    DBService service;

    @RequestMapping(value = "/add_employee_db",method= RequestMethod.POST)
    public String add(@RequestBody Employee employee){


        return service.add(employee);
    }

}
