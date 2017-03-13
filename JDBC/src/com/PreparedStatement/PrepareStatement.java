package com.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PrepareStatement {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Properties p=new Properties();
		p.setProperty("user", "system");
		p.setProperty("password", "welcome");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",p);
		String sql="insert into employee values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 17);
		ps.setString(2, "KIRAN");
		ps.setInt(3,20);
		String sql1="select * from employee where empname=?";
		PreparedStatement ps1=con.prepareStatement(sql1);
		ps1.setString(1, "KIRAN");
		System.out.println(ps1.execute());
		ResultSet rs=ps1.getResultSet();
		while(rs.next())
			System.out.println(rs.getInt(1)+"");
		//System.out.println(Statement.SUCCESS_NO_INFO);
		ps.execute();
		System.out.println(ps.getUpdateCount());
		
		

	}

}
