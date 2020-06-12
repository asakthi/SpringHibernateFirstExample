package com.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);
		
		Student student = new Student();
		student.setSno(103);
		student.setSname("Ramesh");
		student.setSemail("ramesh@durga.com");
		student.setSmobile("33333");
		
		studentDAO.insertStudent(student);
	}
}
