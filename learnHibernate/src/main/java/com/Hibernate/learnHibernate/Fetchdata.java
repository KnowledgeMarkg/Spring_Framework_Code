package com.Hibernate.learnHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchdata {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		StudentDb studentDb = session.get(StudentDb.class, 1);
		System.out.println(studentDb);
		
		factory.close();
		session.close();
	}

}
