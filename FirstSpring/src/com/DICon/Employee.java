package com.DICon;

public class Employee {
	
	private int id;
	private String name;
	private Address add;
	
	public Employee()
	{
		System.out.println("emp");
	}
	public Employee(int id)
	{
		this.id=id;
	}
	public Employee(String name)
	{
		this.name=name;
	}
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void display()
	{
		System.out.println(id+""+name);
		System.out.println(add.display());
	}
	public Employee(int id,String name,Address add)
	{
		this.id=id;
		this.name=name;
		this.add=add;
	}

}
