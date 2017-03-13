package com.connections;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CreateConnection {


public static void main(String... args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
{
    Driver  d=(Driver)Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
    
    Properties p=new Properties();
    p.setProperty("user", "scott");
    p.setProperty("password", "welcome");
    
//    Connection con=d.connect("jdbc:odbc:ora11g", p);
    
    
Driver  d1=(Driver)Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    
    
    Connection con1=d.connect("jdbc:oracle:oci8:@ora11g", p);
    
    System.out.println("Connection created");
    
    
    Connection con2=d1.connect("jdbc:oracle:thin:@localhost:1521:ora11g", p);
    System.out.println("Connection created");
    
    
    //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con3=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ora11g", p);
    System.out.println("Conn cre");
}  

}
