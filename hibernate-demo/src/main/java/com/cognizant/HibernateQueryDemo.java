package com.cognizant;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateQueryDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
//		Query query = session.createQuery("select emp from Employee emp");
//		List<Employee> list = query.list();
//		for(Employee e : list) {
//			System.out.println(e);
//		}
		Query query = session.createQuery("select e.empId, e.name from Employee e");
		// call the list and iterate the items
		List<Object> list = query.list();
		for(Object obj : list) {
			Object[] props = (Object[])obj;
			System.out.println("Id = "+props[0]+", Name = "+props[1]);
		}
		session.close();
		factory.close();
	}

}
