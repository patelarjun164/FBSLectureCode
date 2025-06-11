package com.hackmech;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car") // this will connect the table car with class car

public class Car {
	public Car(int i, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="modelnumber")
	int modelNo;
	@Column(name="colour")
	String colour;
	@Column(name="carprice")
	float price;
	String brand;
}
