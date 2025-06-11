package com.hackmech;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Product> products = new HashSet();
		 
		 Bill b1 = new Bill(1, 1000, products);
		 
		 Product p1 = new Product(1, "Pendrive", b1);
		 Product p2 = new Product(2, "SSD", b1);
		 
		 b1.getProducts().add(p1);
		 b1.getProducts().add(p2);
		 
		 Session session = new Configuration().configure().buildSessionFactory().openSession();
		 Transaction tr = session.beginTransaction();
		 
//		 session.persist(b1);
		 
		 tr.commit();
		 session.close();
	}

}
