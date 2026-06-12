package com.aryan.employee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.aryan.employee.entity.Employee;
import com.aryan.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
    
    @PutMapping("/{id}")
    public Employee updateEmployee(
    @PathVariable Long id,
    @RequestBody Employee employee) {
    return employeeService.updateEmployee(id, employee);
  

    }

}