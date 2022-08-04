package com.training.micro.employee.dto;

import com.training.micro.employee.entity.Employee;

public class ResponseTemplate {

	private Employee employee;
	private Department department;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
