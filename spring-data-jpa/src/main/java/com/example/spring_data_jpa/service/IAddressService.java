package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.dto.DTOAddress;

public interface IAddressService {
    public DTOAddress findAddressById(Long id);
}
