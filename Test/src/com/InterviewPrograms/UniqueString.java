package com.InterviewPrograms;

public class UniqueString {
	
	
	public static void main(String[] args) {
		System.out.println(isUniqueChars("abc"));
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(-10 >> 2);
	}
	
	public static boolean isUniqueChars(String str) {
		 int checker = 0;
		 for (int i = 0; i < str.length(); ++i) {
		 int val = str.charAt(i) - 'a';
		if ((checker & (1 << val)) > 0) return false;
		 checker |= (1 << val);
		 }
		 return true;
		 }

}
