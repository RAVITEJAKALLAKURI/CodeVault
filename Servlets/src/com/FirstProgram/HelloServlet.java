package com.FirstProgram;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class HelloServlet implements Servlet{

	private ServletConfig config;

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "HeeloServlet";
	}

	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		
		this.config=config;
		System.out.println(config.getServletName()+"Initialized");
		
	}

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=res.getWriter();
		
	}

}
