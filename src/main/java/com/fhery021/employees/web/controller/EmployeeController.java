package com.fhery021.employees.web.controller;

import com.fhery021.employees.model.EmployeeDTO;
import com.fhery021.employees.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/randomEmployee")
    public ResponseEntity<EmployeeDTO> getRandomEmployee() {
        return new ResponseEntity<>(employeeService.getRandomEmployee(), HttpStatus.OK);
    }
}
