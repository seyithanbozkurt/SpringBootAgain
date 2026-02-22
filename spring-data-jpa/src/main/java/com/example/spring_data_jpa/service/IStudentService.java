package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Student;

import java.util.List;

public interface IStudentService {
    public Student saveStudent(Student student);
    public List<Student> GetAllStudents();
    public Student getStudentByID(Integer id);
    public void deleteStudentById(Integer id);
    public Student updateStudent(Integer id, Student updateStudent);
}
