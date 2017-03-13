package com.Sort;

public class Primes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getNumberOfPrimes(15));
	}

	
	static int getNumberOfPrimes(int n) {
		int count=0;
		    int primes=0;
		    for(int i=1;i<=n;i++)
		        {
		        count=0;
		        for(int j=2;j<=i;j++)
		            {
		            if(i%j==0)
		                count++;
		        }
		        if(count ==1)
		            primes++;
		    }
return primes;
		}
}
