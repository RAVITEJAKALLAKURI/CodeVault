package com.ReflectionAPI;

public class Simple {

	
	private String Input="123";
	private static String stInput="123st";
	private void valid()
	{
		System.out.println("123");
	}
	
	private void validInput(String Input)
	{
		System.out.println("123"+Input);
	}
	
	private static  void validateInput(String Input)
	{
		System.out.println("Validate"+Input);
	}
	
	public static  void publicInput(String Input)
	{
		System.out.println("public"+Input);
	}
	
	private static  void InputInt(int Input)
	{
		System.out.println("integer"+Input);
	}
}
