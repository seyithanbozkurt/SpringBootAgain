package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.dto.DTOEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DTOEmployee> findAllEmployees();
}
