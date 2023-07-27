package com.employeemanagement.impl;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.model.Employee;
import com.employeemanagement.repository.EmployeeRepository;
import com.employeemanagement.service.EmployeeService;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployee(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = Employee.builder()
                .name(employeeDto.getName())
                .designation(employeeDto.getDesignation()).build();
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(EmployeeDto employeeDto) {
        Employee employee = Employee.builder()
                .id(employeeDto.getId())
                .name(employeeDto.getName())
                .designation(employeeDto.getDesignation()).build();
        return employeeRepository.save(employee);
    }
}
