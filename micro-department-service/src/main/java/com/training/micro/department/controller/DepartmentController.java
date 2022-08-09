package com.training.micro.department.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.micro.department.entity.Department;
import com.training.micro.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	Logger log = LogManager.getLogger(DepartmentController.class);

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department addDepartment(@RequestBody Department department) {
		log.info("inside addDepartment()");
		return departmentService.addDepartment(department);
	}

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("inside getDepartmentById()");
		return departmentService.getDepartmentById(departmentId);
	}

}
