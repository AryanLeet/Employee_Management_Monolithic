package com.aryan.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aryan.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
