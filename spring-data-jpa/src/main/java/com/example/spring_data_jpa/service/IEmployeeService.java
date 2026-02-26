package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.dto.DTOEmployee;
import com.example.spring_data_jpa.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<DTOEmployee> findAllEmployees();
}
