package com.Sample;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {  
	    Session session=new Configuration().configure("hibernate.cfg.xml")  
	                        .buildSessionFactory().openSession();  
	    Transaction t=session.beginTransaction();  
	    
	    Employee emp=new Employee();
	    emp.setEmpName("RAVI");
	    session.persist(emp);  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("success");  
	    
	}

}
