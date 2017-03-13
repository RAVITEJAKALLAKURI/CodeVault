package com.stringPrograms;

import java.io.File;
import java.io.IOException;

public class SampleString {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());
		//sb.ensureCapacity(minimumCapacity)
		File f=new File("ravi");
		File f1=new File("ravi1");
		f.createNewFile();
		f.renameTo(f1);
		
		String s="RAVI";
		System.out.println(s.substring(1));
		
	}

}
