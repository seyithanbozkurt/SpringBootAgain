package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.dto.DTOCustomer;

public interface ICustomerController {
    public DTOCustomer findCustomerById(Long id);
}
