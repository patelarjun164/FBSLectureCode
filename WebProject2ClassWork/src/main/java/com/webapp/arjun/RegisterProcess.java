package com.webapp.arjun;

public class RegisterProcess {
	public boolean addUser(String v1, String v2) {
		DataProcess ref = new DatabaseConnectivity();
		boolean result = ref.insertUser(v1, v2);
		return result;
		
	}
	
}
