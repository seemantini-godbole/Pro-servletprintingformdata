package com.prabhat.fuelstudent;

import java.io.*;
import java.util.*;

/*
TABLE NAME Personal_Info
CREATE TABLE Personal_Info(Student_ID bigint  NOT NULL AUTO_INCREMENT,First_Name varchar(64) NOT NULL, 
Last_Name varchar(64) NOT NULL, Date_of_Birth DATE,Email_ID varchar(100), Phone_Number varchar(10), 
Address_Line1 varchar(500), Address_Line2 varchar (500), City varchar(100), State varchar(100), 
Zipcode varchar(20), PRIMARY KEY (Student_ID) ) ENGINE=InnoDB;
*/


public class StudentPersonalInfo {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipcode;
	
	
	public StudentPersonalInfo(String firstName, String lastName, String emailAddress, String phoneNumber, 
							   String addressLine1, String addressLine2, String city, String state, String zipcode)
	{
		this.firstName = new String();
		this.lastName = new String();
		this.emailAddress = new String();
		this.phoneNumber = new String();
		this.addressLine1 = new String();
		this.addressLine2 = new String();
		this.city = new String();
		this.state = new String();
		this.zipcode = new String();
		
		if (firstName != null)
			this.firstName = firstName;
		
		if (lastName != null)
			this.lastName = lastName;
		
		if (emailAddress != null)
			this.emailAddress = emailAddress;
		
		if (phoneNumber != null)
			this.phoneNumber = phoneNumber;
		
		if (addressLine1 != null)
			this.addressLine1 = addressLine1;
		
		if (addressLine2 != null)
			this.addressLine2 = addressLine2;
		
		if (city != null)
			this.city = city;
		
		if (state != null)
			this.state = state;
		
		if (zipcode != null)
			this.zipcode = zipcode;
		
	}
	
	
	public boolean isValid()
	{
		if (this.firstName != null && this.firstName.length() > 0)
		{
			if (this.lastName != null && this.lastName.length() > 0)
			{
				if (this.phoneNumber != null && this.phoneNumber.length() > 0)
					return true;
			}
			
		}
		return false;
		
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getEmailAddress()
	{
		return this.emailAddress;
	}
	
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	public String getAddressLine1()
	{
		return this.addressLine1;
	}
	
	public String getAddressLine2()
	{
		return this.addressLine2;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public String getZipcode()
	{
		return this.zipcode;
	}
}
	