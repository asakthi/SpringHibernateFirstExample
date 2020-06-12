package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

public class StudentDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void insertStudent (Student student) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
	}
}
