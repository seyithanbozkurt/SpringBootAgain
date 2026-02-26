package com.example.spring_data_jpa.controller.impl;

import com.example.spring_data_jpa.controller.IHomeController;
import com.example.spring_data_jpa.dto.DTOHome;
import com.example.spring_data_jpa.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/home")
public class HomeControllerimpl implements IHomeController {
    @Autowired
    public IHomeService homeService;

    @GetMapping("/list/{id}")
    @Override
    public DTOHome findHomeById(@PathVariable(name = "id") Long id) {
        return homeService.findHomeByid(id);
    }
}
