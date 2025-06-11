package com.webapp;

public class CheckUser {
	public boolean checkUser(String uname, String pwd) {
		//jdbc code
		Connectivity obj = new DatabaseConnectivity();
		boolean output = obj.checkIfExists(uname, pwd);
		return output;
	} 
}
