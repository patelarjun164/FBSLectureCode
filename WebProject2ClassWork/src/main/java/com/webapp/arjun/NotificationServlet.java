package com.webapp.arjun;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/notify")
public class NotificationServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		doPost(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("Notification Servlet");
	}
}
