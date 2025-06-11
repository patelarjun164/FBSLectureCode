package com.webapp.arjun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements DataProcess {

	@Override
	public boolean insertUser(String user, String pass) {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connection URL protocol:subprotocol:dbspecific information
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ddl_assignment2", "root", "root");
            String insertQuery = "insert into users values(?, ?)";
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            pstmt.setString(1, user);
            pstmt.setString(2, pass);
            int updateRowCount = pstmt.executeUpdate();
            if(updateRowCount==1) {
            	return true;
            }
            else {
            	return false;
            }
           
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
        	e.printStackTrace();
        }
	 return false;
	}
 
}
