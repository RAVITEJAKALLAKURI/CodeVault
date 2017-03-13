package com.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

import oracle.jdbc.OracleTypes;

public class sampleProcedure {
	
	
	 
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			
			// TODO Auto-generated method stub
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Properties p=new Properties();
			p.setProperty("user", "system");
			p.setProperty("password", "welcome");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",p);
			
			CallableStatement cs= con.prepareCall("{call employee_test(?,?,?)}");
			cs.setInt(1, 17);
			cs.setString(2, "BAVA11");
			cs.setInt(3,20);
			cs.registerOutParameter(1, Types.INTEGER);
			//cs.registerOutParameter(4, Types.LONGNVARCHAR);
			cs.execute();
			System.out.println(cs.getString(1));
			
			CallableStatement cs1= con.prepareCall("{call ?:=employee_fn(?)}");
			//cs.setInt(1, 17);
			cs1.setString(2, "BAVA10");
		//	cs.setInt(3,20);
			cs1.registerOutParameter(1, Types.INTEGER);
			//cs.registerOutParameter(4, Types.LONGNVARCHAR);
			cs1.execute();
			System.out.println(cs1.getInt(1));
			
			CallableStatement cs2= con.prepareCall("{call ?:=cursor(?)}");
			//cs.setInt(1, 17);
			cs2.setInt(2, 20);
		//	cs.setInt(3,20);
			cs2.registerOutParameter(1, OracleTypes.CURSOR);
			//cs.registerOutParameter(4, Types.LONGNVARCHAR);
			cs2.execute();
			
			ResultSet rs=(ResultSet)cs2.getObject(1);
			while(rs.next())
				System.out.println(rs.getInt(1)+rs.getString(2));
		
			System.out.println(cs1.getInt(1));
			
			

}
}