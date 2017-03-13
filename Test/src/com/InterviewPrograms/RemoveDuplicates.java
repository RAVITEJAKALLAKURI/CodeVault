package com.InterviewPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s="TejaTkwej";
		removeDuplicates(s.toCharArray());
	}
	
	public static void removeDuplicates(char[] str) {
		 if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		 boolean[] hit = new boolean[256];
//		 for (int i = 0; i < 256; ++i) {
//	 hit[i] = false;
//		 }
		// hit[str[0]] = true;
		 int tail = 0;
		 for (int i = 0; i < len; ++i) {
		 if (!hit[str[i]]) {
		 str[tail] = str[i];
		 ++tail;
		 hit[str[i]] = true;
		 }
		 }
		 for(int i=tail ;i< str.length;i++)
		 str[i] = 0;
		 System.out.println(str);
		}	
}
