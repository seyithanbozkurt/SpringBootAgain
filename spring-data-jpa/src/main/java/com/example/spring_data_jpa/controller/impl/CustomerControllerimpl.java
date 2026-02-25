package com.example.spring_data_jpa.controller.impl;

import com.example.spring_data_jpa.controller.ICustomerController;
import com.example.spring_data_jpa.dto.DTOCustomer;
import com.example.spring_data_jpa.service.ICustomerService;
import com.example.spring_data_jpa.service.impl.CustomerServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/customer")
public class CustomerControllerimpl implements ICustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/list/{id}")
    @Override
    public DTOCustomer findCustomerById(@PathVariable(name = "id") Long id) {
        return customerService.findCustomerById(id);
    }
}
