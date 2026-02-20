package com.example.spring_rest_api.controller;

import com.example.spring_rest_api.model.Employee;
import com.example.spring_rest_api.model.UpdateEmployeeRequest;
import com.example.spring_rest_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rest/api/employe")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployeList();

    }

    @GetMapping("/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstName", required = false) String firstName,
                                                @RequestParam(name = "lastName", required = false) String lastName)
                                                 {
        return employeeService.getEmployeWithParam(firstName, lastName);
    }

    @PostMapping("/save-employe")
        public Employee saveEmploye(@RequestBody Employee newEmploye){
        return employeeService.saveEmployee(newEmploye);
    }

    @DeleteMapping("/delete-employee/{id}")
    public boolean deleteEmployee(@PathVariable(name = "id") String id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/update-employee/{id}")
    public Employee updateEmployee(@PathVariable(name = "id")String id, @RequestBody UpdateEmployeeRequest request){
        return employeeService.updateEmployee(id, request);
    }

}
