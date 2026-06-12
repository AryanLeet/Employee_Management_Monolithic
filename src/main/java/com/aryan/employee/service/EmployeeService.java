package com.aryan.employee.service;

import java.util.List;

import com.aryan.employee.entity.Employee;

public interface EmployeeService {

Employee saveEmployee(Employee employee);

List<Employee> getAllEmployees();

Employee getEmployeeById(Long id);

void deleteEmployee(Long id);

}