package com.hackmech.SpringProject2;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//service layer

//@RestController
@Controller
public class DataController {

	@Autowired
	StudentRepository repo;
	
	@PostMapping("/student")
	public String addStudent(Student object) {
//		Student object = new Student(1, "arjun", 95);
//		Student object = new Student(studentid ,studentname, marks);
		
		repo.save(object);
		return "Data Added Successfully..!";
	}
	
	/*
	 * @GetMapping("/student") public List<Student> getStudent() { List<Student>
	 * data = repo.findAll(); return data; }
	 */
	
	@GetMapping("/student")
	//model socket between frontend and controller
	public String getStudent(Model ref) {
		
//		Student s1 = new Student(1, "Arjun", 85);
		List<Student> data = repo.findAll();
		ref.addAttribute("key", data);
		
		return "next.html";
	}
	
	///student/{id} called path and {id} is path variable
	@GetMapping("/student/{id}")  //  /student/1
	public Student getStudentByPrimaryKey(@PathVariable int id) {
		Student object = repo.findById(id).get();
		return object;
	}
	
	//suggestion to place path variable before hardcoded value
	@GetMapping("/student/{sname}/name")  //   /student/Arjun
	public List<Student> getStudentByName(@PathVariable String sname){
		List<Student> data = repo.findByName(sname);
		return data;
	}
	
	@GetMapping("/student/custom")
	public List<Object[] > getStudentByCustomQuery(){
		List<Object[] > data = repo.customQuery();
		return data;
	}
}