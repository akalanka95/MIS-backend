package com.epic.MIS.controller;

import com.epic.MIS.model.Employee;
import com.epic.MIS.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/findAll")
    public List<Employee> findAll(){
        return  employeeRepository.findAll();
    }

    @RequestMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

}
