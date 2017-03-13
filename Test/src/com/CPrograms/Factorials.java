package com.CPrograms;

public class Factorials {

	/**
	 * @param args
	 */
	//public static double res,res1;
		public static int temp,res,res1;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		for(int i=1;i <=99999;i++)
		{
		//res=Factorialloop(i);
			
			//int res1=Numberloop(i);
			//String number = String.valueOf(i);
		// System.out.println("Input Number is"+i);
		 temp=i;
		 res1=0;
			while(temp > 0) {
		       res1+= Factorialloop(temp % 10);
		        temp /= 10;
			}

		        if(i==res1)
		        {
		        	System.out.println("Number is"+res1);
		        	}
		    
			
		}

	}
	
	public static int Factorialloop(int number)
	{
		
		int temp1=number;
		int fact=1;
		while(temp1!=0)
		{
			if(temp1!=0)
			//	System.out.println(fact+""+temp);
			fact=fact*temp1;
			temp1-=1;
		}
		return fact;
	}

	
}
