package com.hachmech;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MySqlConnect object = new MySqlConnect();
//		object.connect();
		
//		FileConnectivity object1 = new FileConnectivity();
//		object1.attach();
		
//		Connectivity object = new FileConnectivity();
//		object.connect();
		
		Connectivity object = ConnectivityFactory.getObject();
		object.connect();
//
	}

}
