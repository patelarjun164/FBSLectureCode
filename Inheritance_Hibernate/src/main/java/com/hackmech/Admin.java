package com.hackmech;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="admin1")
//@DiscriminatorValue(value = "A")
public class Admin extends Employee{

	@Column(name="allowance")
	double allowance;
	
	public Admin() {
		
	}

	public Admin(int eid, String name, double salary, double allowance) {
		super(eid, name, salary);
		this.allowance = allowance;
		// TODO Auto-generated constructor stub
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	
}
