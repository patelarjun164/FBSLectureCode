package com.hackmech;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		 Session session = new Configuration().configure().buildSessionFactory().openSession();
		 Transaction tr = session.beginTransaction();
		 
		 Employee e1 = new Admin(1, "Arjun", 85000, 5000);
		 Employee e2 = new HR(2, "Rishi", 25000, 2000);
		 Employee e3 = new Sales(3, "Rohit", 45000, 3000);
		 
		 session.persist(e1);
		 session.persist(e2);
		 session.persist(e3);
		 
		 tr.commit();
		 session.close();
	}
}
