package com.firstSpring;

public class Student {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Student(String name)
{  
	super();
     this.name=name;	
}

public Student()
{  
	super();
   	
}
public void displayInfo(){
	System.out.println("Hello: "+name);
}
}
