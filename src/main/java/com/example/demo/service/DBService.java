package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DBService {

    @Autowired
    EmployeeRepository repository;

    public String add( Employee employee){

        repository.save(employee);

        return "Employee Added to DB ...";
    }
}
