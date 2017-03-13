package com.stringPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;


public class StringPattern {

public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String s ="abasjnabmzcmskciowecmsncjfgewtcjn0122213";
		TreeMap<Character, Integer> hmap = new TreeMap<Character, Integer>();
		for(Character c : s.toCharArray()){
			Integer freq=hmap.get(c);
			if(freq==null){
				hmap.put(c,1);
				}
			else
			hmap.put(c,freq+1);
			freq=null;
		}
		StringBuffer sb = new StringBuffer();
		for(Map.Entry<Character, Integer> m : hmap.entrySet()){
			Character c1= m.getKey();
			for(int i=0 ,count=hmap.get(c1).intValue();i<count;i++){
			sb.append(m.getKey());	
				
			}
			}
		System.out.println(sb);
		Properties p=new Properties();
		p.setProperty("eee", "13");
		File f=new File("abc.txt");
		f.createNewFile();
		p.load(new FileInputStream("H:\\EclipsePrograms\\Test\\src\\com\\stringPrograms\\abc.properties"));
		System.out.println(p.getProperty("testp"));
		p.setProperty("testp", "13");
		p.list(new PrintStream(new FileOutputStream("H:\\EclipsePrograms\\Test\\src\\com\\stringPrograms\\abc.properties")));
		p.store(new FileOutputStream("H:\\EclipsePrograms\\Test\\src\\com\\stringPrograms\\abc.properties"), "testp");
		}


}
