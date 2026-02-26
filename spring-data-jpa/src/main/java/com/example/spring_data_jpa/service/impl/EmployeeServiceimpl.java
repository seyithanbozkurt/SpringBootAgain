package com.example.spring_data_jpa.service.impl;

import com.example.spring_data_jpa.dto.DTODepartment;
import com.example.spring_data_jpa.dto.DTOEmployee;
import com.example.spring_data_jpa.entity.Employee;
import com.example.spring_data_jpa.repository.EmployeeRepository;
import com.example.spring_data_jpa.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceimpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DTOEmployee> findAllEmployees() {
        List<DTOEmployee> dtoEmployeeList = new ArrayList<>();

        List<Employee> employeeList =  employeeRepository.findAll();
         if(employeeList!=null && !employeeList.isEmpty()){
            for(Employee employee:employeeList){
                DTOEmployee dtoEmployee = new DTOEmployee();
                BeanUtils.copyProperties(employee,dtoEmployee);

                dtoEmployee.setDepartment(new DTODepartment(employee.getDepartment().getId(),
                        employee.getDepartment().getDepartmentName()));
                dtoEmployeeList.add(dtoEmployee);
           }
       }
        return dtoEmployeeList;
    }
}
