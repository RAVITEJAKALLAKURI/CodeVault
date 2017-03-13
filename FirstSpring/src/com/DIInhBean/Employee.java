package com.DIInhBean;

public class Employee {

	private String degree;
	private String name;
	private Address ad;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name,String degree,Address ad)
	{
		
	this.name=name;
	this.degree=degree;
	this.ad=ad;
		
	}

	public Employee(String name,String degree)
	{
		
	this.name=name;
	this.degree=degree;
	//this.ad=ad;
		
	}
  public void details()
  {
	  System.out.println(name+""+degree);
	  System.out.println(ad.toString());
	  
  }
  
}
