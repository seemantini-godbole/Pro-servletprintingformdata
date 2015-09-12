package com.prabhat.servletprintingformdata;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.util.*;

import com.prabhat.fuelstudent.*;
import com.prabhat.fueldboperations.*;

public class FormFieldsPrintingServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String firstName = req.getParameter("first_name");
		String lastName = req.getParameter("last_name");
		String emailAddress = req.getParameter("email_id");
		String phoneNumber = req.getParameter("phone_number");
		String addressLine1 = req.getParameter("address_line_1");
		String addressLine2 = req.getParameter("address_line_2");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String zipcode = req.getParameter("zipcode");
		
		out.println("<html>");

		out.println("<head>");
		out.println("<title>Fuel Registration</title>");
		out.println("</head>");
		
		out.println("<body>");
		
		StudentPersonalInfo student = new StudentPersonalInfo(firstName, lastName, emailAddress, phoneNumber, addressLine1, addressLine2, city, state, zipcode);
		int addSuccess = InsertNewStudentIntoDB.addNewStudentIntoDB(student);
		
		
		if (addSuccess > 0)
		{
			
			out.println("<h3>Congratulations, You are registered as</h3>");
			out.println("Date here is: " + (new Date()).toLocaleString());
		
			out.println("<p/>");
			out.println("First Name: " + req.getParameter("first_name"));
			out.println("<br/>");
			out.println("Last Name: " + req.getParameter("last_name"));
			out.println("<br/>");
			out.println("Email Address: " + req.getParameter("email_id"));
			out.println("<br/>");
			out.println("Phone Number: " + req.getParameter("phone_number"));
			out.println("<br/>");
			out.println("Address Line 1: " + req.getParameter("address_line_1"));
			out.println("<br/>");
			out.println("Address Line 2: " + req.getParameter("address_line_2"));
			out.println("<br/>");
			out.println("City: " + req.getParameter("city"));
			out.println("<br/>");
			out.println("State: " + req.getParameter("state"));
			out.println("<br/>");
			out.println("Zipcode: " + req.getParameter("zipcode"));
			
			

			//print congratulations only if student has been registered
			//print all students that are registered
	

			out.println("<p/> Thank you for registering with Fuel Career Counselling program");
		}
		else
		{
			out.println("<h3>Error Occured, please try again</h3>");
			
			out.println("<p/>");
			out.println("First Name: " + req.getParameter("first_name"));
			out.println("<br/>");
			out.println("Last Name: " + req.getParameter("last_name"));
			out.println("<br/>");
			out.println("Email Address: " + req.getParameter("email_id"));
			out.println("<br/>");
			out.println("Phone Number: " + req.getParameter("phone_number"));
			out.println("<br/>");
			out.println("Address Line 1: " + req.getParameter("address_line_1"));
			out.println("<br/>");
			out.println("Address Line 2: " + req.getParameter("address_line_2"));
			out.println("<br/>");
			out.println("City: " + req.getParameter("city"));
			out.println("<br/>");
			out.println("State: " + req.getParameter("state"));
			out.println("<br/>");
			out.println("Zipcode: " + req.getParameter("zipcode"));
			
			
			out.println("Date here is: " + (new Date()).toLocaleString());
		
			out.println("<p/>");
		}
		
		out.println("</body>");

		out.println("</html>");
	}
}

