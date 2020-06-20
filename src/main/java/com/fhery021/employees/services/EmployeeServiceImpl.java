package com.fhery021.employees.services;

import com.fhery021.employees.model.EmployeeDTO;
import com.fhery021.employees.repositories.EmployeeRepository;
import com.fhery021.employees.web.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Slf4j
@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper mapper;

    private static final int MAX_RETRIES = 10;
    private static final long FIRST_ID = 10001;

    @Override
    public EmployeeDTO getRandomEmployee() {
        long qty = employeeRepository.count();

        // employee' ids begins with 10001


        boolean found = false;
        int retries = 0;
        long id = -1;

        while (!found && ++retries <= MAX_RETRIES) {
            id = ThreadLocalRandom.current().nextLong(FIRST_ID, FIRST_ID + qty);
            if (employeeRepository.existsById(id)) {
                found = true;
                log.info("Employee found with id: " + id);
            } else {
                log.info("Random id = " + id + " not found. Try nr: " + retries);
            }
        }

        return employeeRepository.findById(id)
                .map(mapper::employeeToEmployeeDTO)
                .orElseThrow();

    }
}
