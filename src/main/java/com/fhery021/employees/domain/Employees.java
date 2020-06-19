package com.fhery021.employees.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
public class Employees {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long empNo;

    private LocalDate birthDate;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String hireDate;
}
