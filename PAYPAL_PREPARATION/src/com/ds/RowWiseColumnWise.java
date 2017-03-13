package com.ds;

public class RowWiseColumnWise {
	
	int search(int mat[][], int n, int x)
	{
	   int i = 0, j = n-1;  //set indexes for top right element
	   while ( i < n && j >= 0 )
	   {
	      if ( mat[i][j] == x )
	      {
	         System.out.println("\n Found at %d, %d"+i+j);
	         return 1;
	      }
	      if ( mat[i][j] > x )
	        j--;
	      else //  if mat[i][j] < x
	        i++;
	   }
	 
	   System.out.println("\n Element not found");
	   return 0;  // if ( i==n || j== -1 )
	}
	 

public static void main(String[] args) {
	
}

}
