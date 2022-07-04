package com.training.portal.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.training.portal.dao.DepartmentDao;
import com.training.portal.model.Department;

public class DepartmentServiceImpl implements DepartmentService {

	private static Logger logger = LogManager.getLogger(DepartmentServiceImpl.class);
	
	@Inject
	private DepartmentDao<Department, String> departmentDao;

	@Override
	public List<Department> getDepartments() {
		
		logger.info("inside getDepartments()");
		
		departmentDao.openCurrentSession();
		
		List<Department> departments = departmentDao.findAll();
		departmentDao.closeCurrentSession();
		
		logger.debug(departments);
		
		return departments;
	}

}
