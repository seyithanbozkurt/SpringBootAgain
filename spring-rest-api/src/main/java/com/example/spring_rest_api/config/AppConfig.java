package com.example.spring_rest_api.config;

import com.example.spring_rest_api.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<Employee> EmployeList()
    {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Gül", "Bozkurt"));
        employeeList.add(new Employee(2,"Hakan", "Yazıcı"));
        employeeList.add(new Employee(3,"Ahmet", "Demir"));
        employeeList.add(new Employee(4,"Hüseyin", "Çelik"));
        employeeList.add(new Employee(5,"Seyithan", "Bozkurt"));

        return  employeeList;
    }
}
