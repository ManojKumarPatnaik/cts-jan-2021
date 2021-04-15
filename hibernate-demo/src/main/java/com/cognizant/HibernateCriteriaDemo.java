package com.cognizant;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCriteriaDemo {
	public static void main(String[] args) {
		// 1st step is to create Configuration object that loads the xml configuration file
		Configuration cfg = new Configuration();
		cfg.configure();
		
		// 2nd step is to create SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		// 3rd step is to create Session 
		Session session = factory.openSession();
		
		Criteria crt = session.createCriteria(Employee.class);
		// it gets all the records and adds them in the Collection List
		List<Employee> list =  crt.list();
		for(Employee e : list) {
			System.out.println("Id = "+e.getEmpId()+", Name = "+e.getName()+", Salary = "+e.getSalary());
		}
		session.close();
		factory.close();
	}
}
