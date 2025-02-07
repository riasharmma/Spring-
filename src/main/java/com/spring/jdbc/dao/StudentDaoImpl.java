package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query = "insert into student(id,name,city) value(?,?,?)";
		int res=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return res;
	}
	public int update(Student student) {
		String query="update student set name=?, city=? where id=?";
		int res=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return res;
	}
	public int delete(int studentId) {
		String query="delete from student where id=?";
		int res=this.jdbcTemplate.update(query,studentId);
		return res;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
