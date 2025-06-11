package com.webapp.arjun;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class RegisterServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doPost(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		RegisterProcess obj = new RegisterProcess();
		boolean processResult = obj.addUser(username, password);
		PrintWriter out = res.getWriter();
		
		
		if(processResult == true) {
			RequestDispatcher rd = req.getRequestDispatcher("notify");
			rd.forward(req, res);
//			rd.include(req, res); // will combine output of both servelet
//			res.sendRedirect("login.html);
			
		} else {
//			out.println("Something Went Wrong...!");
			res.sendRedirect("error.html");
		}
	}
}

