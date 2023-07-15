package com.springJDBC.withXML.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springJDBC.withXML.Query;
import com.springJDBC.withXML.Entity.Student;

@Component("studentDao")
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(Student student) {
		int result = this.jdbcTemplate.update(Query.insert,student.getId(),student.getName(),student.getCity());
		return result;
	}
	public int update(Student student) {
		int result = this.jdbcTemplate.update(Query.update,student.getName(),student.getCity(),student.getId());
		return result;
	}
	public Student select(int id) {
		Student student = this.jdbcTemplate.queryForObject(Query.select, new RowMapperImpl(),id);
		System.out.println(student);
		return student;
	}
	public List<Student> selectAll() {
		List<Student> students = this.jdbcTemplate.query(Query.selectAll, new RowMapperImpl());
		return students;
	}
}
