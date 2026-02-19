package com.example.spring_rest_api.repository;

import com.example.spring_rest_api.model.Employee;
import com.example.spring_rest_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private List<Employee> EmployeList;

    public List<Employee> getAllEmployeList() {
        return EmployeList;
    }
}
