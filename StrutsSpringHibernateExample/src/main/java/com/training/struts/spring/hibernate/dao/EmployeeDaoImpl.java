package com.training.struts.spring.hibernate.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.training.struts.spring.hibernate.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {
	// Session factory injected by spring context
	private SessionFactory sessionFactory;

	// This method will be called when a employee object is added
	@Override
	public void addEmployee(Employee employee) {
		this.sessionFactory.getCurrentSession().save(employee);
	}

	// This method return list of employees in database
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		return this.sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	// Deletes a employee by it's id
	@Override
	public void deleteEmployee(Integer employeeId) {
		Employee employee = (Employee) sessionFactory.getCurrentSession().load(Employee.class,
				employeeId);
		if (null != employee) {
			this.sessionFactory.getCurrentSession().delete(employee);
		}
	}

	// This setter will be used by Spring context to inject the sessionFactory
	// instance
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}