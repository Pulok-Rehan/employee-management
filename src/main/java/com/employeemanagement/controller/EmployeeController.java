package com.employeemanagement.controller;

import com.employeemanagement.dto.EmployeeDto;
import com.employeemanagement.model.Employee;
import com.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/employeeManagement")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }
    @PostMapping("/employees")
    public Optional<Employee> getEmployee(@RequestParam Long employeeId){
        return employeeService.getEmployee(employeeId);
    }
    @PostMapping("/addEmployee")
    public Employee addEmpployee(@RequestBody EmployeeDto employeeDto) throws Exception {
        try {
            return employeeService.addEmployee(employeeDto);
        }
        catch (Exception exception){
            exception.printStackTrace();
            throw new Exception("Could not create employee");
        }
    }
    @DeleteMapping
    public void deleteEmployee(@RequestParam Long employeeId) throws Exception {
        try{
            employeeService.deleteEmployee(employeeId);
        }
        catch (Exception exception){
            throw new Exception("Could not delete Employee");
        }
    }
    @PostMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody EmployeeDto employeeDto) throws Exception {
        try{
            Employee employee = employeeService.updateEmployee(employeeDto);
            return employee;
        }
        catch (Exception exception){
            throw new Exception("Could not delete Employee");
        }

    }
}
