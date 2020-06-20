package com.fhery021.employees.services;

import com.fhery021.employees.model.EmployeeDTO;
import com.fhery021.employees.repositories.EmployeeRepository;
import com.fhery021.employees.web.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper mapper;

    @Override
    public EmployeeDTO getRandomEmployee() {
        long qty = employeeRepository.count();

        // employee' ids begins with 10001
        long random = ThreadLocalRandom.current().nextLong(10001, 10001+qty);

        return employeeRepository.findById(random)
                .map(mapper::employeeToEmployeeDTO)
                .orElseThrow();
    }
}
