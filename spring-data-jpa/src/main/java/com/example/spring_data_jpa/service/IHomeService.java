package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.dto.DTOHome;

public interface IHomeService {
    public DTOHome findHomeByid(Long id);
}
