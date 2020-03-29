package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentService {

	public List<Student> findAll();
	public int create(Student s);
	public int delete(int id);
	public int update(Student s);
	public int count();
	public List<Student> findByName(Student s);
	
	
	
	
}
