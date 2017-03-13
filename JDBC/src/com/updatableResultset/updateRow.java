package com.updatableResultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class updateRow {
	
	public static int dno;

	public static void main(String... args) throws ClassNotFoundException,SQLException
	{
		//static int dno;
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Properties properties=new Properties();
	properties.setProperty("user", "system");
	properties.setProperty("password", "welcome");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",properties);
	
/*		String sql1="Alter table employee add SeqNo Number(15,2)";
	Statement st1=con.createStatement();
	st1.execute(sql1);*/
	
	String sql="select empno,deptno from employee";
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery(sql);
	//rs.first();
	//System.out.println(rs.relative(5));
//	System.out.println(rs.findColumn("deptno"));
	while(rs.next())
	{
		System.out.println(rs.getInt(1));
		dno=rs.getInt(2);
		if(dno==20)
			rs.updateInt(2, 10);
		
		if(dno==3)
			rs.deleteRow();
		rs.updateRow();
		
	/*	rs.relative(3);
		System.out.println(rs.getInt(1));
		rs.relative(-1);
		System.out.println(rs.getInt(1));*/
	}
	rs.beforeFirst();
	
	while(rs.next())
	{
		if(dno==3)
		System.out.println("123");
	}
}
}
