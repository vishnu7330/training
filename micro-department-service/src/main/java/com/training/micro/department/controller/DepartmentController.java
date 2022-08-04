package com.training.micro.department.controller;

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

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/")
	public Department addDepartment(@RequestBody Department department) {
		return departmentService.addDepartment(department);
	}

	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {

		return departmentService.getDepartmentById(departmentId);
	}

}
