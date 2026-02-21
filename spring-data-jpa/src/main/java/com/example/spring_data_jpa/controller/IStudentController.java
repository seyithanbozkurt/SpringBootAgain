package com.example.spring_data_jpa.controller;

import com.example.spring_data_jpa.entity.Student;

import java.util.List;

public interface IStudentController {
    public Student saveStudent(Student student);
    public List<Student> GetAllStudents();
    public Student getStudentById(Integer id);
}
