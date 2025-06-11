package com.hackmech;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="rollnumber")
	int rollNo;
	@Column(name="name")
	String name;
	@Column(name="marks")
	int marks;
	@Embedded
	CustomDate doj;
	
	//Explore OnetoOne
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_details_id")
    private StudentDetails studentDetails;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name, int marks, CustomDate doj, StudentDetails studentDetails) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.doj = doj;
        this.studentDetails = studentDetails;
    }
	
	public CustomDate getDoj() {
		return doj;
	}
	public void setDoj(CustomDate doj) {
		this.doj = doj;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
