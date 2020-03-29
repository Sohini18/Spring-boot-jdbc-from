package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.StudentDao;
import com.cognizant.dao.StudentDaoImpl;
import com.cognizant.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao dao;
	@Override
	public List<Student> findAll() {
		return dao.findAll();
	}

	@Override
	public int create(Student s) {
		return dao.create(s);
	}

	@Override
	public int delete(int id) {
		
		return dao.delete(id);
	}

	@Override
	public int update(Student s) {
		
		return dao.update(s);
	}

	@Override
	public int count() {
		return dao.count();
	}

	@Override
	public List<Student> findByName(Student s) {
		
		return dao.findByName(s);
	}

}
