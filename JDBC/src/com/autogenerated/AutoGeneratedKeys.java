package com.autogenerated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class AutoGeneratedKeys {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Properties properties=new Properties();
		properties.setProperty("user", "system");
		properties.setProperty("password", "welcome");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",properties);
		
/*		String sql1="Alter table employee add SeqNo Number(15,2)";
		Statement st1=con.createStatement();
		st1.execute(sql1);*/
		
		String sql="insert into employee(empno,empname,deptno)values(12,'RA',10)";
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		st.executeUpdate(sql,new String[]{"seqno"});
		ResultSet rs=st.getGeneratedKeys();
		
		System.out.println(rs.next()+""+rs.getInt(1));
		
		
		String sql1="Create table emp_personal_details(empno number,name varchar2(20),photo BLOB)";
		Statement st1=con.createStatement();
		st1.executeQuery(sql1);
		
		

	}

}
