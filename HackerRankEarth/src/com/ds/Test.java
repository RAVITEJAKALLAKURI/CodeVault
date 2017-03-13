package com.ds;

import java.util.Scanner;
import java.util.Vector;

public class Test {

	
	Test()
	{}
	{
		final Vector v;
		v= new Vector();
	}

	

	public static void main(String[] args) {
		
//		int a[]={1,2,3,4,5};
//		int d[]=a;
//		int sum=0;
//		for(int j=0;j<3;j++)
//		{
//			sum+=(a[j]*d[j])+(a[j+1]*d[j]);
//		}
//		System.out.println(sum);
//		
//		byte b=6;
//		b+=8;
//		System.out.println(b);
//		b+=7;
//		System.out.println(b);
		
		//new Test().go();
		
		int x=0;
		int y=0;
		for(int z=0;z<5;z++)
		{
			if((x++>2) && (++y>2))
				x++;
		}
		System.out.println(x+""+y);
		
		Scanner s= new Scanner(System.in);
		String[] sr=s.nextLine().split(" ");
		System.out.println(sr[0]+sr[1]);
		
	}



	private void go() {
		// TODO Auto-generated method stub
		
		Runnable r = new Runnable()
		{
			public void run()
			{
				System.out.println("");
			}
		};
		
	}
}
