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

    @RequestMapping(value = "update_emp_db",method = RequestMethod.PUT)
    public String update(@RequestParam String name, @RequestParam Integer id){

        //1 get the object from DB
        Employee employee= repository.getById(id);
        //2 change the name
        employee.setName(name);
        //3 save again to DB
        repository.save(employee);
        return "Name updates Succsessfully ";
    }

    @RequestMapping(value = "delete_emp_db", method =RequestMethod.DELETE)
      public String delete(@RequestParam Integer id){
        repository.deleteById(id);
        return "Employee Deleted Successfully ";
    }

}
