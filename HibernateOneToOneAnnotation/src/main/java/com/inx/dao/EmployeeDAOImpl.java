package com.inx.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.inx.model.Employee;


public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
 	private SessionFactory sessionFactory;
	
	public void save(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(employee);
		
		tx.commit();
		session.close();
		System.out.println("Success");
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getEmployee() {
		Session session = sessionFactory.openSession();
		TypedQuery<Employee> query = session.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		
		return list;
	}

}
