package com.example.demo.service;

import com.example.demo.repository.AppFLowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppFlowService {

    @Autowired
    AppFLowRepo repo;

    public String message(){

        return repo.message();
    }
}
