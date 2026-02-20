package com.example.spring_rest_api.service;

import com.example.spring_rest_api.model.Employee;
import com.example.spring_rest_api.model.UpdateEmployeeRequest;
import com.example.spring_rest_api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployeList() {
        return employeeRepository.getAllEmployeList();
    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.getEmployeeById(id);
    }

    public List<Employee> getEmployeWithParam(String FirstName, String LastName) {
        return employeeRepository.getWithParamsEmployee(FirstName, LastName);
    }

    public Employee saveEmployee(Employee newEmployee) {
        return employeeRepository.saveEmployee(newEmployee);
    }

    public boolean deleteEmployee(String id) {
        return employeeRepository.deleteEmployee(id);
    }

    public Employee updateEmployee(String id, UpdateEmployeeRequest request) {
        return employeeRepository.updateEmployee(id, request);
    }
}
