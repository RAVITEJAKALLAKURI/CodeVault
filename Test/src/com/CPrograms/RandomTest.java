package com.CPrograms;

import java.util.Random;

public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//something like this

		int min = 10;
		int max = 15;
int min1=0;
		Random rand = new Random();
		int result;
while(min1>=20)
{
		result = rand.nextInt(max - min) +min;
		System.out.println(result);
		min1+=1;
}
	}

}