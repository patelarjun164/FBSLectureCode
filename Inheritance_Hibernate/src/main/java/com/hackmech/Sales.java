package com.hackmech;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="sales1	")
//@DiscriminatorValue(value="S")
public class Sales extends Employee{

	@Column(name="target")
	double commision;
	
	public Sales() {
		
	}

	public Sales(int eid, String name, double salary, double commision) {
		super(eid, name, salary);
		this.commision = commision;
		// TODO Auto-generated constructor stub
	}

	public double getCommision() {
		return commision;
	}

	public void setCommision(double commision) {
		this.commision = commision;
	}
	
}
