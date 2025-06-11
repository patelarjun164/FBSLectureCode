package com.hackmech.SpringProject2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	//tokenation -- findBy - StudName(find using reflecation)
	public List<Student> findByName(String v1);
	public List<Student> findByNameAndStudId(String v1, int v2);
	
	public List<Student> findByNameLike(String pattern);
	public List<Student> findByStudIdBetween(int low, int high);
	
	//create on repo //exploring
	//code diveded in to token, and compile it by token, its called as tokenisation
	
	//name and student should be variable name and class name
	//here 1 is parameter number
	//give nativeQuery=true for use raw sql query
	@Query(value="select name from Student", nativeQuery=true)
	public List<Object[]> customQuery();
}