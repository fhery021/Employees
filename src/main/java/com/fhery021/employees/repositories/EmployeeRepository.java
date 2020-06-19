package com.fhery021.employees.repositories;

import com.fhery021.employees.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

    List<Employees> findAll();

    List<Employees> findAllByEmpNo();
}
