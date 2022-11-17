package com.training.springboot.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.rest.model.Employee;
import com.training.springboot.rest.repository.EmployeeRepository;
import com.training.springboot.rest.service.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee addEmployee(Employee newEmployee) {
		return employeeRepository.save(newEmployee);
	}

	@Override
	public Employee getEmployee(Long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteById(Long id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public List<Employee> findByName(String name) {
		return employeeRepository.findByName(name);
	}

}
