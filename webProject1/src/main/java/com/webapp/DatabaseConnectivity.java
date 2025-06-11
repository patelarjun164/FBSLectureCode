package com.webapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DatabaseConnectivity implements Connectivity{

	@Override
	public boolean checkIfExists(String v1, String v2) {
		//JDBC code
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            //connection URL protocol:subprotocol:dbspecific information
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ddl_assignment2", "root", "root");
	            String query = "select * from list where first_name=? and last_name=?";
	            PreparedStatement pstmt = con.prepareStatement(query);
	            pstmt.setString(1, v1);
	            pstmt.setString(2, v2);
	            
	            ResultSet rs = pstmt.executeQuery();
	            return rs.next();
	           
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        }
		 return false;
	}
}
