package com.prabhat.examplebasicservlet;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;


public class HelloWorldServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");

		out.println("<head>");
		out.println("<title>Hello Servlet</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h3>Hello World! We are finally here after maven</h3>");
		out.println("<h3>This file is checked into git</h3>");
		out.println("Date here is: " + (new Date()).toLocaleString());
		out.println("</body>");

		out.println("</html>");
	}
}

