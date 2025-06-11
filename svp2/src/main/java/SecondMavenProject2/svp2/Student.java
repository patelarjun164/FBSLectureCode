package SecondMavenProject2.svp2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student2")
public class Student {
	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.rollNo = i;
		this.name = string;
		this.marks = j;
	}
	@Id
	@Column(name="rollnumber")
	int rollNo;
	@Column(name="name")
	String name;
	@Column(name="marks")
	int marks;
	
}
