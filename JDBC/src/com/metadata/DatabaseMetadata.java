package com.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseMetadata {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Properties prop=new Properties();
		prop.setProperty("user", "system");
		prop.setProperty("password", "welcome");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g",prop);
		DatabaseMetaData db=con.getMetaData();
		
		System.out.println(db.getDatabaseMajorVersion() +"Major"+db.getDatabaseMinorVersion()+"Minor"+db.getDatabaseProductName()+"name"+db.getDatabaseProductVersion());
		
		System.out.println(db.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)+""+db.updatesAreDetected(ResultSet.CONCUR_UPDATABLE));
		
		System.out.println(db.ownUpdatesAreVisible(ResultSet.CONCUR_UPDATABLE));
	}

}
