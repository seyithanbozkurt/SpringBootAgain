package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.dto.DTOHome;

public interface IHomeController {
    public DTOHome findHomeById(Long id);
}
