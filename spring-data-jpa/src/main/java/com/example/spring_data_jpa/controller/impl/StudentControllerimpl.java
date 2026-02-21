package com.example.spring_data_jpa.controller.impl;

import com.example.spring_data_jpa.controller.IStudentController;
import com.example.spring_data_jpa.entity.Student;
import com.example.spring_data_jpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/list")
    @Override
    public List<Student> GetAllStudents() {
        return studentService.GetAllStudents();
    }

    @GetMapping("/list/{id}")
    @Override
    public Student getStudentById(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentByID(id);
    }


}
