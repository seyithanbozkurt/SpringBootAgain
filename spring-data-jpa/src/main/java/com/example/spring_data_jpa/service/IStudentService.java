package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.dto.DTOStudent;
import com.example.spring_data_jpa.dto.DTOStudentIU;
import com.example.spring_data_jpa.entity.Student;

import java.util.List;

public interface IStudentService {
    public DTOStudent saveStudent(DTOStudentIU dtoStudentIU);
    public List<DTOStudent> GetAllStudents();
    public DTOStudent getStudentByID(Integer id);
    public void deleteStudentById(Integer id);
    public DTOStudent updateStudent(Integer id, DTOStudentIU updateStudentIU);
}
