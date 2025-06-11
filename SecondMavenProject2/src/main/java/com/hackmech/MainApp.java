package com.hackmech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainApp {
	public static void main(String[] args) {
		Student student = new Student(5, "Smiriti Mandhana", 100, new CustomDate(02, 11, 1999), new StudentDetails("Pune", "9081884526"));
//		Configuration cfg = new Configuration();
//		cfg.configure("config2.xml");
//		SessionFactory factory = cfg.buildSessionFactory();
//		Session ses= factory.openSession();
		
		Session ses = new Configuration().configure("config2.xml").buildSessionFactory().openSession();		
		Transaction tr = ses.beginTransaction();
		ses.persist(student);
		//hibernate method to add data we will use persist method// ex insert method
		
		tr.commit();
		ses.close();
	}
}
