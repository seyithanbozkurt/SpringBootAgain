package com.example.spring_data_jpa.controller.impl;

import com.example.spring_data_jpa.controller.IEmployeeController;
import com.example.spring_data_jpa.dto.DTOEmployee;
import com.example.spring_data_jpa.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/api/employee")
public class EmployeeControllerimpl implements IEmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @GetMapping
    @Override
    public List<DTOEmployee> findAllEmployees() {
        return employeeService.findAllEmployees();
    }
}
