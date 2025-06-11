package com.hackmech.SpringProject2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="studid")
	int studId;
	String name;
	int marks;
	
	public Student() {
		
	}
	
public Student(String name) {
	this.name = name;
	}

	public Student(int studId, String name, int marks) {
		super();
		this.studId = studId;
		this.name = name;
		this.marks = marks;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

}
