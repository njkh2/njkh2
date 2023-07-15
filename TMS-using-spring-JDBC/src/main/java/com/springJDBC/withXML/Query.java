package com.springJDBC.withXML;

public class Query {
	public static String insert = "insert into student (id,name,city) values(?,?,?)";
	public static String update = "update student set name=?,city=? where id=?";
	public static String delete = "delete from student where id = ?";
	public static String select = "select * from student where id = ?";
	public static String selectAll = "select * from student";
	public Query() {
		// TODO Auto-generated constructor stub
	}

}
