package com.employeemanagement.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDto {
    private long id;
    private String name;
    private String designation;

}

