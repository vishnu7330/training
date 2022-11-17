package com.training.rest.mongodb.service;

import java.util.List;

import com.training.rest.mongodb.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee addEmployee(Employee newEmployee);

	public Employee getEmployee(String id);

	public Employee updateEmployee(Employee employee);

	public void deleteById(String id);

	public List<Employee> findByName(String name);

}
