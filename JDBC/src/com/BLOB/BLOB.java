package com.BLOB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BLOB {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ClassNotFoundException,SQLException, IOException {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Properties properties=new Properties();
		properties.setProperty("user", "system");
		properties.setProperty("password", "welcome");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",properties);
		
		/*String sql1="Create table emp_personal_details(empno number,name varchar2(20),photo BLOB)";
		Statement st1=con.createStatement();
		st1.executeQuery(sql1);*/
		
		String sql="insert into emp_personal_details values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 2);
		ps.setString(2, "RAVI");
		//File photo=new File("I:\\IMAGES\\HEROINES\\KAJAL\\10 (1)_cr.jpg");
		
		File photo=new File("H:\\COMPUTER SHORTCUTS.pdf");
		FileInputStream fis=new FileInputStream(photo);
		ps.setBinaryStream(3, fis, (int)photo.length());
		ps.execute();
		

		String sql1="select * from emp_personal_details epd where epd.empno=2";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql1);
		while(rs.next())
		{
			int empno=rs.getInt(1);
			String name=rs.getString(2);
			InputStream is=rs.getBinaryStream(3);
			FileOutputStream fos=new FileOutputStream("D:\\computer.pdf");
			int i=is.read();
			while(i!=-1)
			{
				fos.write(i);
				i=is.read();
			}
			
		}
		Blob b=con.createBlob();
		Clob c=con.createClob();
		
		
		
		ps.setInt(1, 2);
		ps.setString(2, "RAVI");
		byte[] data=new byte[2];
		b.setBytes(0, data);
		ps.setBlob(3, b);
		ps.execute();
		//c.setString(1, )
		
	}

}
