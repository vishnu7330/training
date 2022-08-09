package com.training.micro.employee.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.employee.dto.ResponseTemplate;
import com.training.micro.employee.entity.Employee;
import com.training.micro.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	Logger log = LogManager.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee employee) {
		log.info("inside addEmployee()");
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/{id}")
	public ResponseTemplate getEmployeeWithDepartment(@PathVariable("id") Long employeeId) {
		log.info("inside getEmployeeWithDepartment()");
		return employeeService.getEmployeeWithDepartment(employeeId);
	}

}
