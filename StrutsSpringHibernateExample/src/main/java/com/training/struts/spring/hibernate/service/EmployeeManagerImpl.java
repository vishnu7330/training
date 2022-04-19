package com.training.struts.spring.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.training.struts.spring.hibernate.dao.EmployeeDAO;
import com.training.struts.spring.hibernate.model.Address;
import com.training.struts.spring.hibernate.model.Employee;

public class EmployeeManagerImpl implements EmployeeManager {
	
	// Employee dao injected by Spring context
	private EmployeeDAO employeeDAO;

	// This method will be called when a employee object is added
	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		List<Address> addresses = new ArrayList<Address>();
		Address address = new Address();
		address.setId(555);
		address.setCity("SFO");
		address.setZipCode("12345");
		addresses.add(address);
		employee.setAddressList(addresses);
		
		employeeDAO.addEmployee(employee);
	}

	// This method return list of employees in database
	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	// Deletes a employee by it's id
	@Override
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		employeeDAO.deleteEmployee(employeeId);
	}

	// This setter will be used by Spring context to inject the dao's instance
	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}
}