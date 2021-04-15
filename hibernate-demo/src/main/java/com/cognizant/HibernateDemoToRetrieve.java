package com.cognizant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemoToRetrieve {
	public static void main(String[] args) {
		// 1st step is to create Configuration object that loads the xml configuration file
		Configuration cfg = new Configuration();
		cfg.configure();
		
		// 2nd step is to create SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		// 3rd step is to create Session 
		Session session = factory.openSession();
		Employee emp = session.get(Employee.class, 100);
		System.out.println("Id: "+emp.getEmpId()+", Name: "+emp.getName()+", Salary: "+emp.getSalary());
		
		session.close();
		factory.close();
		
		System.out.println("DONE!");
		
	}
}
