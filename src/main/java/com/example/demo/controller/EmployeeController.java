package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmployeeController {

    ArrayList<Employee> employeeArrayList= new ArrayList<>();


    //1- create

    @RequestMapping("add_emp")
    public String add(){
     Employee employee=new Employee("Raj",1,"IT");
        employeeArrayList.add(employee);
      return "Employee added Succefully...";
    }

    //2- read

    @RequestMapping("/get_emplist")
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;

    }
    //3-update

    @RequestMapping("update_emp")
    public String update(){
        employeeArrayList.get(0).setName("JAVA");
       return "Name Updates Successfully ..." ;
    }

    // delete

    @RequestMapping("/delete_emp")
    public String delete(){

        employeeArrayList.remove(0);

        return "Employee deleted successfully ....";
    }

}
