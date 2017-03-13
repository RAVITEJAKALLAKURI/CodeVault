package com.AspectJ;

public class ThrowsAdvice  implements org.springframework.aop.ThrowsAdvice{
	
	public void afterThrowing(Exception ex){  
        System.out.println("additional concern if exception occurs");  
    }   

}
