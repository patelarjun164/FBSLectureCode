package com.phoenix.demos;

public class Consultant implements Payable {

	String name;
	float rateOfRemuneration;
	Address postal;
	
	public Consultant() {
		System.out.println("Default constructor of consultant");
	}
	
	public Consultant(String v1, float v3, Address v2)
	{
		name=v1;
		rateOfRemuneration=v3;
		postal=v2;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getRateOfRemuneration() {
		return rateOfRemuneration;
	}

	public void setRateOfRemuneration(float rateOfRemuneration) {
		this.rateOfRemuneration = rateOfRemuneration;
	}

	public Address getPostal() {
		return postal;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}

	public void pay()
	{
		System.out.println("Pay Consultant");
	}
	
	public void display()
	{
		System.out.println(postal.getLine1());
	}
}
