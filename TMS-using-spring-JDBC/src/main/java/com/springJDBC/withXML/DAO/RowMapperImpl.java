package com.springJDBC.withXML.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springJDBC.withXML.Entity.Student;

public class RowMapperImpl implements RowMapper<Student>{
	public Student mapRow(ResultSet rs , int row) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}
	
	public RowMapperImpl() {
		// TODO Auto-generated constructor stub
	}

}
