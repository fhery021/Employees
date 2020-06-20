package com.fhery021.employees.web.mapper;

import com.fhery021.employees.domain.Employees;
import com.fhery021.employees.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDTO employeeToEmployeeDTO(Employees employees);

    Employees employeeDTOToEmployees(EmployeeDTO employeeDTO);

}
