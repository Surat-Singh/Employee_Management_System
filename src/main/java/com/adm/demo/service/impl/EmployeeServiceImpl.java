package com.adm.demo.service.impl;

import com.adm.demo.dto.EmployeeDto;
import com.adm.demo.entity.Employee;
import com.adm.demo.mapper.EmployeeMapper;
import com.adm.demo.repository.EmployeeRepository;
import com.adm.demo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
