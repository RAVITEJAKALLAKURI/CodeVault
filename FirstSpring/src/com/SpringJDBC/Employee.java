package com.SpringJDBC;

public class Employee {

	
	public int Id;
	public String name;
	public String city;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int Id,String name, String City) {
		// TODO Auto-generated constructor stub
this.city=City;
this.name=name;
this.city=City;

	}
	
	public String getCity() {
		return city;
	}public int getId() {
		return Id;
	}
	public void setCity(String city) {
		this.city = city;
	}public void setId(int id) {
		Id = id;
	}public String getName() {
		return name;
	} public void setName(String name) {
		this.name = name;
	}
}
