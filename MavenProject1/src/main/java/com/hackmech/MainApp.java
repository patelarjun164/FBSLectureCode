package com.hackmech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainApp {
	public static void main(String[] args) {
		
		Car object = new Car(1,"X", 123, "Y");
		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session ses= factory.openSession();		
		
		Transaction tr = ses.beginTransaction();
		ses.persist(object);
		//hibernate method to add data we will use persist method// ex insert method
		
		tr.commit();
		ses.close();
	}
}
