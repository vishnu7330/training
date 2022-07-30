package com.training.springboot.rest.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.rest.model.Employee;
import com.training.springboot.rest.service.EmployeeService;

@RestController
public class EmployeeController {

	Logger logger = LogManager.getLogger(getClass());

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		logger.info("inside getAllEmployees()");
		return employeeService.getAllEmployees();
	}

	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee newEmployee) {
		logger.info("inside addEmployee()");
		return employeeService.addEmployee(newEmployee);
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		logger.info("inside getEmployee(), id: " + id);
		return employeeService.getEmployee(id);
	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
		logger.info("inside updateEmployee(), id: " + id);
		Employee employee = employeeService.getEmployee(id);
		employee.setAge(newEmployee.getAge());
		employee.setName(newEmployee.getName());
		employee = employeeService.updateEmployee(employee);
		return employee;
	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		logger.info("inside deleteEmployee(), id: " + id);
		employeeService.deleteById(id);
	}

	@GetMapping("/employees/{name}")
	public List<Employee> findEmployeesByName(@PathVariable String name) {
		logger.info("inside findEmployeesByName(), name: " + name);
		return employeeService.findByName(name);
	}

}
