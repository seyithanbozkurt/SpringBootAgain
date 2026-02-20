package com.example.spring_rest_api.repository;

import com.example.spring_rest_api.model.Employee;
import com.example.spring_rest_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private List<Employee> EmployeList;

    public List<Employee> getAllEmployeList() {
        return EmployeList;
    }

    public Employee getEmployeeById(String id) {
        Employee findedEmployee = null;
        for (Employee employee : EmployeList) {
            if(id.equals(employee.getId())) {
                findedEmployee = employee;
                break;
            }
        }
        return findedEmployee;
    }


    public List<Employee> getWithParamsEmployee(String firstName, String lastName) {
        List<Employee> employeesWithParams = new ArrayList<>();
        if(firstName == null && lastName == null) {
            return EmployeList;
        }
        for(Employee employee : EmployeList) {
            if(firstName!=null && lastName!=null) {
                if(employee.getFirstName().equalsIgnoreCase(firstName) && employee.getLastName().equalsIgnoreCase(lastName)) {
                    employeesWithParams.add(employee);
                }
            }
            if(firstName!=null && lastName==null) {
                if(employee.getFirstName().equalsIgnoreCase(firstName)) {
                    employeesWithParams.add(employee);
                }
            }
            if(firstName==null && lastName!=null) {
                if(employee.getLastName().equalsIgnoreCase(lastName)) {
                    employeesWithParams.add(employee);
                }
            }
        }
        return employeesWithParams;
    }

    public Employee saveEmployee(Employee newEmployee) {
        EmployeList.add(newEmployee);
        return newEmployee;
    }

    public boolean deleteEmployee(String id) {
        Employee deletedEmployee = null;
        for (Employee employee : EmployeList) {
            if(id.equals(employee.getId())) {
                deletedEmployee = employee;
                break;
            }
        }
        if(deletedEmployee == null) {
            return false;
        }
        EmployeList.remove(deletedEmployee);
        return true;

    }





}
