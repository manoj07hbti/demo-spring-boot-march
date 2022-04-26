package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DBController {

   /* @Autowired
    ClassName objName;*/
    //create

    @Autowired
    EmployeeRepository repository;

    @RequestMapping(value = "/add_emp_db",method= RequestMethod.POST)
    public String add(@RequestBody Employee employee){

        repository.save(employee);

        return "Employee Added to DB ...";
    }

    // get

    @RequestMapping(value = "get_emp_db",method = RequestMethod.GET)
    public List<Employee> getAll(){

      return repository.findAll();
    }

    //update

  /*  public String update(@RequestParam String name, @RequestParam Integer id){

        //1 get the object from DB
        *//*Optional<Employee> employee= repository.findById(id);
        employee.get().setName(name);
        repository.save(employee);
        return "Name updates Succsessfully ";*//*
    }*/

    @RequestMapping(value = "delete_emp_db", method =RequestMethod.DELETE)
      public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "Employee Deleted Successfully ";
    }

}
