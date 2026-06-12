package com.aryan.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aryan.employee.entity.Employee;
import com.aryan.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

private final EmployeeRepository employeeRepository;

public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
}

@Override
public Employee saveEmployee(Employee employee) {
    return employeeRepository.save(employee);
}

@Override
public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
}

@Override
public Employee getEmployeeById(Long id) {
    return employeeRepository.findById(id).orElse(null);
}

@Override
public void deleteEmployee(Long id) {
    employeeRepository.deleteById(id);
}

}