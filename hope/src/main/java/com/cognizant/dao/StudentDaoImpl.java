package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public List<Student> findAll() {
		String sql="select * from stud";
		return jt.query(sql, (rs, rowNum) -> new Student(rs.getInt(1), rs.getString(2), rs.getString(3)));

	}

	@Override
	public int create(Student student) {
		String sql="insert into stud values(?,?,?)";
		int res=jt.update(sql,student.getId(),student.getName(),student.getCourse());
		return res;
	}

	@Override
	public int delete(int id) {
		String sql="delete from stud where id=?";
		int res=jt.update(sql,id);
		return res;
	}

	@Override
	public int update(Student student) {
		String sql="update stud set name=?,course=? where id=?";
		int res=jt.update(sql,student.getName(),student.getCourse(),student.getId());
		return res;
	}

	@Override
	public int count() {
		return findAll().size();
	}

	@Override
	public List<Student> findByName(Student student) {
		String sql="select * from stud where name=?";
		EmployeeRowMapper rowmapper=new EmployeeRowMapper();
		return jt.query(sql, rowmapper,student.getName());
	}

}
