package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.dto.DTOCourse;
import com.example.spring_data_jpa.dto.DTOStudent;
import com.example.spring_data_jpa.dto.DTOStudentIU;
import com.example.spring_data_jpa.entity.Course;
import com.example.spring_data_jpa.entity.Student;
import com.example.spring_data_jpa.repository.StudentRepository;
import com.example.spring_data_jpa.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceimpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DTOStudent saveStudent(DTOStudentIU  dtoStudentIU) {
        DTOStudent response = new DTOStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);

        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent, response);
        return response;
    }


    @Override
    public List<DTOStudent> GetAllStudents() {
        List<DTOStudent> dtolist = new ArrayList<>();
        List<Student> studentLists = studentRepository.findAllStudents();
        for (Student student : studentLists) {
            DTOStudent dto = new DTOStudent();
            BeanUtils.copyProperties(student, dto);
            dtolist.add(dto);
        }
        return dtolist;
    }

    @Override
    public DTOStudent getStudentByID(Integer id) {
        /*
        DTOStudent dto = new DTOStudent();
       Optional<Student> optional =  studentRepository.findStudentById(id);
       if (optional.isPresent()) {
           Student dbStudent = optional.get();
           BeanUtils.copyProperties(dbStudent, dto);
       }
       return dto;
         */

        DTOStudent dtoStudent = new DTOStudent();
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            return null;
        }
        Student dbStudent = optional.get();
        BeanUtils.copyProperties(dbStudent, dtoStudent);

        if(dbStudent.getCourse() != null && !dbStudent.getCourse().isEmpty()) {
            for (Course course : dbStudent.getCourse()) {
                DTOCourse dtoCourse = new DTOCourse();
                BeanUtils.copyProperties(course, dtoCourse);

                dbStudent.getCourse().add(course);
            }
        }
        return dtoStudent;
    }

    @Override
    public void deleteStudentById(Integer id) {
      // Student dbStudent = getStudentByID(id);
        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            studentRepository.deleteById(id);
        }
    }

    @Override
    public DTOStudent updateStudent(Integer id, DTOStudentIU updateStudentIU) {
        DTOStudent dto = new DTOStudent();

        Optional<Student> optional = studentRepository.findById(id);
        if (optional.isPresent()) {
            Student dbstudent = optional.get();
            dbstudent.setFirstname(updateStudentIU.getFirstname());
            dbstudent.setLastname(updateStudentIU.getLastname());
            dbstudent.setBirthOfDate(updateStudentIU.getBirthOfDate());

            Student updatedStudent = studentRepository.save(dbstudent);
            BeanUtils.copyProperties(updatedStudent, dto);
            return dto;

        }
//        Student dbStudent  = getStudentByID(id);
//        if (dbStudent != null) {
//            dbStudent.setFirstname(updateStudent.getFirstname());
//            dbStudent.setLastname(updateStudent.getLastname());
//            dbStudent.setBirthOfDate(updateStudent.getBirthOfDate());
//            return studentRepository.save(dbStudent);
//        }
//        return null;
        return null;
    }


}
