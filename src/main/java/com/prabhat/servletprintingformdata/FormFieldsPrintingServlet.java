package com.prabhat.servletprintingformdata;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;


public class FormFieldsPrintingServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");

		out.println("<head>");
		out.println("<title>FormFieldPrintingServlet</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h3>This servlet prints all form data</h3>");
		out.println("<h3>This file is checked into git and compiled with maven</h3>");
		out.println("Date here is: " + (new Date()).toLocaleString());
		
		out.println("<p/>");
		out.println("First Name is: " + req.getParameter("first_name"));
		out.println("<br/>");
		out.println("Last Name is: " + req.getParameter("last_name"));
		
		out.println("This is the line added after second commit in git by same local user");

		out.println("This line was added by the contributor ria-vinod and merged into master");
		out.println("Added one more line in line with the pull request comments I got");
		
		out.println("</body>");

		out.println("</html>");
	}
}

