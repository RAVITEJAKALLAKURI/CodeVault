package com.connections;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CreateTable {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Properties p=new Properties();
//	String sql="Create table Department(deptno Number(15,2),deptname varchar2(20))";
	String sql1="insert into department values(20,'hostel')";
	String sql="Select * from employee";
	p.setProperty("user", "system");
	p.setProperty("password", "welcome");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",p);
	Statement stmt=con.createStatement();
	//System.out.println(stmt.executeUpdate(sql));
	ResultSet rs=stmt.executeQuery(sql);
	while(rs.next())
		System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+true);
	
	
	stmt.execute(sql);
	System.out.println(stmt.getUpdateCount());
	
		
	}

}
