package com.training.rest.basic.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.rest.basic.auth.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
