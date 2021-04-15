package com.cognizant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	public static void main(String[] args) {
		// 1st step is to create Configuration object that loads the xml configuration file
		Configuration cfg = new Configuration();
		cfg.configure();
		
		// 2nd step is to create SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		// 3rd step is to create Session 
		Session session = factory.openSession();
		
		Employee employee = new Employee();
		employee.setEmpId(500);
		employee.setName("Edward");
		employee.setSalary(74200);
		
		// 4th step is to save the object but you must begin the transaction
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		
		session.close();
		factory.close();
		
		System.out.println("DONE!");
		
	}

}
