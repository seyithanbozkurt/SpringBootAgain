package com.example.spring_data_jpa.controller.impl;

import com.example.spring_data_jpa.controller.IAddressController;
import com.example.spring_data_jpa.dto.DTOAddress;
import com.example.spring_data_jpa.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerimpl implements IAddressController {

    @Autowired
    private IAddressService addressService;

    @GetMapping("/list/{id}")
    @Override
    public DTOAddress findAddressById(@PathVariable(name="id") Long id) {
        return addressService.findAddressById(id);
    }
}
