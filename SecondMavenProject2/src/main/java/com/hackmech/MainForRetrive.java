package com.hackmech;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainForRetrive {
	public static void main(String[] args) {
		
		
		Session ses = new Configuration().configure("config2.xml").buildSessionFactory().openSession();
		Student obj = ses.getReference(Student.class ,1);
		
		Transaction tr = ses.beginTransaction();
		
		System.out.println(obj.getName());
		//Student.class provide structure for class, not class name
		ses.remove(obj);
		tr.commit();
		ses.close();
		
	}
}
