package com.example.spring_data_jpa.controller.impl;

import com.example.spring_data_jpa.controller.IStudentController;
import com.example.spring_data_jpa.dto.DTOStudent;
import com.example.spring_data_jpa.dto.DTOStudentIU;
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
    public DTOStudent saveStudent(@RequestBody DTOStudentIU dtoStudentIU) { //Dto kullanılmalı normalde
        return studentService.saveStudent(dtoStudentIU);
    }

    @GetMapping("/list")
    @Override
    public List<DTOStudent> GetAllStudents() {
        return studentService.GetAllStudents();
    }

    @GetMapping("/list/{id}")
    @Override
    public DTOStudent getStudentById(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentByID(id);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void deleteStudentById(@PathVariable(name = "id") Integer id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("/update/{id}")
    @Override
    public DTOStudent updateStudent(@PathVariable(name = "id") Integer id, @RequestBody DTOStudentIU updateStudentIU) {
        return studentService.updateStudent(id, updateStudentIU);
    }


}
