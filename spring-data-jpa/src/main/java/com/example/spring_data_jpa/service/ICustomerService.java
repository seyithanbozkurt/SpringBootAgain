package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.dto.DTOCustomer;

public interface ICustomerService {
    public  DTOCustomer findCustomerById(Long id);
}
