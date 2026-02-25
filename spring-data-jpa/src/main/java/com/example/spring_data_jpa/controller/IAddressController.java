package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.dto.DTOAddress;

public interface IAddressController {
    public DTOAddress findAddressById(Long id);
}
