package com.fhery021.employees.web.mapper;

import com.fhery021.employees.domain.Employees;
import com.fhery021.employees.model.EmployeeDTO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-06-20T16:14:59+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.7 (JetBrains s.r.o.)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO employeeToEmployeeDTO(Employees employees) {
        if ( employees == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmpNo( employees.getEmpNo() );
        employeeDTO.setBirthDate( employees.getBirthDate() );
        employeeDTO.setFirstName( employees.getFirstName() );
        employeeDTO.setLastName( employees.getLastName() );
        employeeDTO.setGender( employees.getGender() );
        employeeDTO.setHireDate( employees.getHireDate() );

        return employeeDTO;
    }

    @Override
    public Employees employeeDTOToEmployees(EmployeeDTO employeeDTO) {
        if ( employeeDTO == null ) {
            return null;
        }

        Employees employees = new Employees();

        employees.setEmpNo( employeeDTO.getEmpNo() );
        employees.setBirthDate( employeeDTO.getBirthDate() );
        employees.setFirstName( employeeDTO.getFirstName() );
        employees.setLastName( employeeDTO.getLastName() );
        employees.setGender( employeeDTO.getGender() );
        employees.setHireDate( employeeDTO.getHireDate() );

        return employees;
    }
}
