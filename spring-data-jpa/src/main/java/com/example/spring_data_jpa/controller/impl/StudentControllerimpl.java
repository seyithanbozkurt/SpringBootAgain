package com.example.spring_data_jpa.controller.impl;

import com.example.spring_data_jpa.controller.IStudentController;
import com.example.spring_data_jpa.entity.Student;
import com.example.spring_data_jpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerimpl implements IStudentController {

    @Autowired
    private IStudentService studentService;
    @PostMapping("/save")
    @Override
    public Student saveStudent(@RequestBody Student student) { //Dto kullanılmalı normalde
        return studentService.saveStudent(student);
    }
}
