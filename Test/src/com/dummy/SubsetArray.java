package com.dummy;

import java.util.ArrayList;

public class SubsetArray {

	public static void main(String[] args) {
		int set[] = {10, 20, 30};
        printSubsets(set);
	}

	private static void printSubsets(int[] set) {
		int n = set.length;
		int sum = 0;
		 
        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0; i < (1<<n); i++)
        {
     
            ArrayList<Integer> temp = new ArrayList<Integer>();
            // Print current subset
            for (int j = 0; j < n; j++)
            {
                if ((i & (1 << j)) > 0)
                {
                    System.out.print(set[j] + " ");
                    temp.add(set[j]);
                }
            }
 
            System.out.println();
            int largest = findLargestEle(temp);
            int tempSum = findSum(largest);
            sum= sum + tempSum;
            
        }
        System.out.println("sum : " + sum);
	}

	private static int findSum(int input) {
		int sum = 0; 
		while (input != 0) 
		{ 
			int lastdigit = input % 10; 
			sum += lastdigit; 
			input /= 10; 
		}
		return sum;
	}

	private static int findLargestEle(ArrayList<Integer> numbers) {
		if(numbers.size() == 0)
			return 0;
		int largest = Integer.MIN_VALUE;
		        for(Integer num : numbers) {
		            if(num > largest) {
		                largest = num;
		            }
		        }
		        return largest;
	}

}

