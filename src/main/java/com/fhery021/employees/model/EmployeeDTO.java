package com.fhery021.employees.model;

import com.fhery021.employees.domain.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeDTO {

    private Long empNo;

    private LocalDate birthDate;

    private String firstName;

    private String lastName;

    private Gender gender;

    private String hireDate;
}
