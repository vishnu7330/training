package com.training.micro.department.service;

import com.training.micro.department.entity.Department;

public interface DepartmentService {

	Department addDepartment(Department department);

	Department getDepartmentById(Long departmentId);

}
