package com.CPrograms;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Phone {
public static void printRepeatedWord(String a)
{
Map<String, String> num = new HashMap<String, String>();
Map<String, String> numind = new HashMap<String, String>();
num.put("ABc","123");
num.put("bcd","345");
num.put("cda","523");
num.put("abc","678");

for(String number:num.keySet())

{
	String[] numbe=number.split("");
String[] value=num.get(number).split("");

for(int i=0;i<number.length()-1;i++)
{
	
	numind.put(numbe[i], value[i]);
	}
	
}


String[] numbea=a.split("");


for(int i=0;i<a.length()-1;i++)
{
	
	System.out.println(numind.get(numbea[i]));
	}

}
public static void main(String[] args) {
String a ="Abc";
printRepeatedWord(a);
}
}