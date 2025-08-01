package com.phoenix.demos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * Payable ref=new Consultant(); ref.pay();
		 */
		@SuppressWarnings("resource")
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);
		Payable ref=(Payable)ctx.getBean("createConsultant");
		ref.pay();
		ref.display();
		/*
		 * Payable ref2=(Payable)ctx.getBean("ref"); if(ref==ref2) {
		 * System.out.println("Same"); } else { System.out.println("Different"); }
		 * ref.pay();
		 */
	}
}
