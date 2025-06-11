package com.hackmech;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	 public static void main(String[] args) {
		 Set<Player> batters = new HashSet();
		 
		 Team t1 = new Team(1, "MRCB(W)", batters);
		 
		 Player p1 = new Player(1, "Ellyse Perry",12, 581, t1);
		 Player p2 = new Player(2, "Smriti Mandhana",18, 581, t1);
		 
		 t1.getPlayers().add(p1);
		 t1.getPlayers().add(p2);
		 
		 Session session = new Configuration().configure().buildSessionFactory().openSession();
		 Transaction tr = session.beginTransaction();

		 //hello world
//		 Team obj = session.getReference(Team.class, 1);
//		 System.out.println(obj.getTeamName());
		 session.persist(t1);
		 
		 tr.commit();
		 session.close();
			
	}
}
