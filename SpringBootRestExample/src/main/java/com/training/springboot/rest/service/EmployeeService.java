package com.training.springboot.rest.service;

import java.util.List;

import com.training.springboot.rest.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee addEmployee(Employee newEmployee);

	public Employee getEmployee(Long id);

	public Employee updateEmployee(Employee employee);

	public void deleteById(Long id);

	public List<Employee> findByName(String name);

}
