package com.savePoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SavePoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Properties properties=new Properties();
		properties.setProperty("user", "system");
		properties.setProperty("password", "welcome");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",properties);
		
		Statement st=con.createStatement();
		String sql="`Update employee set deptno=100 where deptno=10";
		st.executeUpdate(sql);
		Statement st1=con.createStatement();
		String sql1="`Update employee set deptno=200 where deptno=10";
		st.executeUpdate(sql1);
		
	
		Statement st2=con.createStatement();
		String sql2="`Update employee set deptno=300 where deptno=10";
		st.executeUpdate(sql2);
		Statement st3=con.createStatement();
		String sql3="`Update employee set deptno=400 where deptno=10";
		st.executeUpdate(sql3);
		
		

	}

}
