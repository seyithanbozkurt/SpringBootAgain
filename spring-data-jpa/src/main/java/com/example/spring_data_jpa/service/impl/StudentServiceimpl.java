package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.entity.Student;
import com.example.spring_data_jpa.repository.StudentRepository;
import com.example.spring_data_jpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StudentServiceimpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public List<Student> GetAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }
}
