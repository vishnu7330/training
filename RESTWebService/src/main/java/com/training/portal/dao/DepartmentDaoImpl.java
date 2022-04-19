package com.training.portal.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.training.portal.model.Department;

public class DepartmentDaoImpl implements DepartmentDao<Department, String> {
	
	private static Logger logger = LogManager.getLogger(DepartmentDaoImpl.class);

	private Session currentSession;

	private Transaction currentTransaction;

	public DepartmentDaoImpl() {

	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}

	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Department.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void persist(Department entity) {
		getCurrentSession().persist(entity);
	}

	public void update(Department entity) {
		getCurrentSession().update(entity);
	}

	public Department findById(String id) {
		Department Department = (Department) getCurrentSession().get(Department.class, id);
		return Department;
	}

	public void delete(Department entity) {
		getCurrentSession().remove(entity);
	}

	public List<Department> findAll() {

		logger.info("inside findAll()");
		List<Department> departments = getCurrentSession().createQuery("from Department", Department.class)
				.getResultList();
		logger.debug(departments);
		return departments;
	}

	public void deleteAll() {
		List<Department> entityList = findAll();
		for (Department entity : entityList) {
			delete(entity);
		}
	}
}
