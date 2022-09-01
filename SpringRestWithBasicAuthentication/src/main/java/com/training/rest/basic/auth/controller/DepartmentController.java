package com.training.rest.basic.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rest.basic.auth.entity.Department;
import com.training.rest.basic.auth.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;

	@GetMapping("/departments")
	public List<Department> getDepartments(){
		return departmentService.getDepartments();
	}
}
