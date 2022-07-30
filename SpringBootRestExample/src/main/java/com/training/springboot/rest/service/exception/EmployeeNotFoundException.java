package com.training.springboot.rest.service.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6135423980653893480L;

	public EmployeeNotFoundException(Long id) {
		super("Could not find employee with id: " + id);
	}
}
