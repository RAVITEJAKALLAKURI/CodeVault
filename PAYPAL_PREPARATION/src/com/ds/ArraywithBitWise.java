package com.ds;

public class ArraywithBitWise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={2,3,3,4,5,5,2,4,7};
		int dup=0;
		
		for(int i=0;i<a.length;i++){
			dup =dup ^a[i];
			
		}
		System.out.println(dup);
		
	}

}
