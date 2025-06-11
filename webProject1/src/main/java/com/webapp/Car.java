package com.webapp;
@Entity

public class Car {
	@Id
	@GenerateValue(strategy = GenerationType.SEQUENCE)
	@Column(name="modelnumber")
	int modelNumber;
	@Column(name="colour")
	String color;
	float price;
	String brand;
}
