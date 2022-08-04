package com.training.micro.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.training.micro.employee.dto.Department;
import com.training.micro.employee.dto.ResponseTemplate;
import com.training.micro.employee.entity.Employee;
import com.training.micro.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public ResponseTemplate getEmployeeWithDepartment(Long employeeId) {
		ResponseTemplate response = new ResponseTemplate();
		Employee employee = employeeRepository.findByEmployeeId(employeeId);
		response.setEmployee(employee);

		Department department = restTemplate
				.getForObject("http://DEPARTMENT-SERVICE/departments/" + employee.getDepartmentId(), Department.class);
		response.setDepartment(department);

		return response;
	}
}
