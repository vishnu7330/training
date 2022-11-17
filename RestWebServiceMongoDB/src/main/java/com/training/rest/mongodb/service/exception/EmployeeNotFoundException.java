package com.training.rest.mongodb.service.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 6135423980653893480L;

	public EmployeeNotFoundException(String id) {
		super("Could not find employee with id: " + id);
	}
}
