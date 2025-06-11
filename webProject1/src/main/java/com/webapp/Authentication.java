package com.webapp; 

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/verify")
public class Authentication extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Method called succcessfully");
		String username = req.getParameter("userid");
		String pwd = req.getParameter("password");
		System.out.println(username + " " + pwd);
		
		CheckUser ref = new CheckUser();
		boolean result = ref.checkUser(username, pwd);
		PrintWriter out = res.getWriter();
		
		if(result) {
			out.println("Valid user");
		} else {
			out.println("Not valid");
		}
	}
}
