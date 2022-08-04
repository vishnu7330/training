package com.training.micro.employee.service;

import com.training.micro.employee.dto.ResponseTemplate;
import com.training.micro.employee.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	ResponseTemplate getEmployeeWithDepartment(Long employeeId);

}
