package com.CLIDeOb;

public class Address {
	
	private String country;
	private String state;
	private String place;
	public Address()
	{
		System.out.println("con");
	}
	public Address(String country,String state,String place)
	{
		this.country=country;
		this.place=place;
		this.state=state;
	}

	public String toString()
	{
		String det=country+""+state+""+place;
		return det;
	}
}
