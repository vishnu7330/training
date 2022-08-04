package com.training.micro.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.employee.dto.ResponseTemplate;
import com.training.micro.employee.entity.Employee;
import com.training.micro.employee.service.EmployeeService;

@RestController("/employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/{id}")
	public ResponseTemplate getEmployeeWithDepartment(@PathVariable("id") Long employeeId) {
		return employeeService.getEmployeeWithDepartment(employeeId);
	}

}
