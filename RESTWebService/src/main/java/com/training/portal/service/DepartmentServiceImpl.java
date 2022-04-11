package com.training.portal.service;

import java.util.List;

import javax.inject.Inject;

import com.training.portal.dao.DepartmentDao;
import com.training.portal.model.Department;

public class DepartmentServiceImpl implements DepartmentService {

	@Inject
	private DepartmentDao<Department, String> departmentDao;

	@Override
	public List<Department> getDepartments() {
		departmentDao.openCurrentSession();
		List<Department> departments = departmentDao.findAll();
		departmentDao.closeCurrentSession();
		return departments;
	}

}
