package com.training.rest.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.training.rest.mongodb.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	List<Employee> findByName(String name);
}
