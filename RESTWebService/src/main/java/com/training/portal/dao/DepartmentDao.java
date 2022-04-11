package com.training.portal.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public interface DepartmentDao<T, Id extends Serializable> {

	public void persist(T entity);

	public void update(T entity);

	public T findById(Id id);

	public void delete(T entity);

	public List<T> findAll();

	public void deleteAll();
	
	public Session openCurrentSession();
	
	public void closeCurrentSession();

}