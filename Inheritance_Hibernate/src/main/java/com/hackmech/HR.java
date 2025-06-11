package com.hackmech;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="hr1")
//@DiscriminatorValue(value = "H")
public class HR extends Employee{
	
	@Column(name="incentive")
	double incentive;
	
	public HR(int eid, String name, double salary, double incentive) {
		super(eid, name, salary);
		this.incentive = incentive;
		// TODO Auto-generated constructor stub
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
}
