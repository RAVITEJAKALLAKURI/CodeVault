package com.Batch;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PreparedStmtBatch 
{

	
	public static void main(String... args) throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Properties p=new Properties();
	p.setProperty("user", "system");
	p.setProperty("password", "welcome");
	try
	{
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",p);
	String sql="insert into employee values(?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);
	BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
	do
	{
		
		ps.setInt(1, Integer.parseInt(dis.readLine()));
		ps.setString(2,dis.readLine());
		ps.setInt(3, Integer.parseInt(dis.readLine()));
		ps.addBatch();
		
	}
	while(dis.readLine().equals("Y"));
	ps.executeBatch();
}
	
	catch(BatchUpdateException e)
	{
		
	}

	}
}