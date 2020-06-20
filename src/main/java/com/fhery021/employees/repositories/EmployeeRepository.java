package com.fhery021.employees.repositories;

import com.fhery021.employees.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

}
