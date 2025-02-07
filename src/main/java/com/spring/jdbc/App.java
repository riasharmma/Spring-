package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App{
	public static void main(String[] args) {
		System.out.println("My internship training begins ");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDaoImpl studentDao = context.getBean("studentDao", StudentDaoImpl.class);
		Student student = new Student();
		student.setId(214);
		student.setName("Pankaj");
		student.setCity("Delhi");
//		int result = studentDao.insert(student);
//		System.out.println("Inserted Data..."+result);
//		int update = studentDao.update(student);
//		System.out.println("Updated Data..." + update); 
		int delete=studentDao.delete(214);
		System.out.println("row deleted..."+ delete);
	}
}
