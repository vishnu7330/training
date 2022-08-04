package com.training.micro.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.micro.department.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}
