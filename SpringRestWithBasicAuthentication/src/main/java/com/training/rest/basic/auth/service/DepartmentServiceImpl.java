package com.training.rest.basic.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.rest.basic.auth.entity.Department;
import com.training.rest.basic.auth.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getDepartments() {
		return departmentRepository.findAll();
	}

}
