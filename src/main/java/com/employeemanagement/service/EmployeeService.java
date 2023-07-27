package com.employeemanagement.service;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getEmployees();
    Optional<Employee> getEmployee(long id);
    Employee addEmployee(EmployeeDto employeeDto);
    void deleteEmployee(long id);
    Employee updateEmployee(EmployeeDto employeeDto);
}
