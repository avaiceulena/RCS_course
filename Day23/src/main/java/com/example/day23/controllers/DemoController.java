package com.example.day23.controllers;

import com.example.day23.DemoService;
import com.example.day23.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value="/employee", method= RequestMethod.GET)
    List<Employee> getEmployees(){
        System.out.println("This is random message test");
        return demoService.getEmployee();
    }

    @RequestMapping(value="/employee/{id}", method= RequestMethod.GET)
    Employee getEmployees(@PathVariable int id){
        return demoService.getEmployees(id);
    }

}
