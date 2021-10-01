package com.inx.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.inx.model.Question;

public class QuestionDAOImpl implements QuestionDAO {

	@Autowired
 	private SessionFactory sessionFactory;
	
	public void save(Question question) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(question);
		
		tx.commit();
		session.close();
		System.out.println("Success");
	}

	@SuppressWarnings("unchecked")
	public List<Question> getQuestionAnswers() {
		Session session = sessionFactory.openSession();
		TypedQuery<Question> query = session.createQuery("from Question");
		List<Question> list = query.getResultList();
		
		return list;
	}

}
