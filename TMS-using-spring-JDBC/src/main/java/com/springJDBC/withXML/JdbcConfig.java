package com.springJDBC.withXML;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJDBC.withXML.DAO.StudentDao;

@Configuration
@ComponentScan(basePackages = {"com.springJDBC.withXML.DAO"})
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
//	@Bean("studentDao")
//	public StudentDao getStudentDao() {
//		StudentDao studentDao = new StudentDao();
//		studentDao.setJdbcTemplate(getTemplate());
//		return studentDao;
//	}
	
	public JdbcConfig() {
		// TODO Auto-generated constructor stub
	}

}
