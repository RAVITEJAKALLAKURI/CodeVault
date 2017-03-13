package com.Batch;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BatchExec {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Properties p=new Properties();
		p.setProperty("user", "system");
		p.setProperty("password", "welcome");
		try
		{
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",p);
		Statement st=con.createStatement();
		String sql="insert into employee values(20,'power',20)";
		st.addBatch(sql);
		String sql1="insert into employee values('RAVI','mania',20)";
		String sql2="insert into employee values(15,'mania',20)";
		st.addBatch(sql1);
		st.addBatch(sql2);
		st.executeBatch();
		st.clearBatch();
		}
		catch(BatchUpdateException e)
		{
			int[] count=e.getUpdateCounts();
			System.out.println(count.length);
		}
		
	}
}
