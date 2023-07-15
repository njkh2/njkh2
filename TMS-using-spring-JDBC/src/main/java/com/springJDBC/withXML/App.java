package com.springJDBC.withXML;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJDBC.withXML.DAO.StudentDao;
import com.springJDBC.withXML.Entity.Student;

public class App {
	 
	public static void main(String[] args) {
		System.out.println("Jai Shree Radhe Krishna");
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		Student student = studentDao.select(1);
		List<Student> students = studentDao.selectAll();
		for(Student st:students) {
			System.out.println(st);
		}
	}
	 
}
