package com.ds;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(testException());
	}

	private static int testException() {
		// TODO Auto-generated method stub
		try{
			
			int a =10/0;
			return a;
		}
		catch(Exception e){
			
	//
		}
		finally{return 10;}
	}

}
