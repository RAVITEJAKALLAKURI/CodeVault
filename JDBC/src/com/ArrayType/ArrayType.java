package com.ArrayType;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ArrayType {

	
	public static void main(String[] args) throws ClassNotFoundException,SQLException, IOException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Properties properties=new Properties();
		properties.setProperty("user", "scott");
		properties.setProperty("password", "welcome");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",properties);
		
		String sql="create or replace TYPE tech_array VARRAY(6) of varchar2(20)";
		Statement st=con.createStatement();
		st.execute(sql);
		String sql1="Create table emp_profesional_details(empno number,name varchar2(20),technologies tech_array)";
		Statement st1=con.createStatement();
		st1.execute(sql1);
}
}