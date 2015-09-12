package com.prabhat.fueldboperations;

import java.io.*;
import java.util.*;
import java.sql.*;
import com.prabhat.fuelstudent.*;

/*
TABLE NAME Personal_Info
CREATE TABLE Personal_Info(Student_ID bigint  NOT NULL AUTO_INCREMENT,First_Name varchar(64) NOT NULL, Last_Name varchar(64) NOT NULL, 
Date_of_Birth DATE,Email_ID varchar(100), Phone_Number varchar(10), Address_Line1 varchar(500), 
Address_Line2 varchar (500), City varchar(100), State varchar(100), Zipcode varchar(20), PRIMARY KEY (Student_ID) ) ENGINE=InnoDB;

*/


public class InsertNewStudentIntoDB {

	static final String STUDENT_TABLE_NAME = "Personal_Info"; 
	static final String FIRST_NAME = "First_Name"; 
	static final String LAST_NAME = "Last_Name"; 
	static final String EMAIL_ID = "Email_ID";
	static final String PHONE_NUMBER = "Phone_Number";
	static final String ADDRESS_LINE_1 = "Address_Line1";
	static final String ADDRESS_LINE_2 = "Address_Line2";
	static final String CITY = "City";
	static final String STATE = "State";
	static final String ZIPCODE = "Zipcode";
	
	
	public static int addNewStudentIntoDB ( StudentPersonalInfo studentInfo)
	{
		int rs = 0;
		
		if (!studentInfo.isValid())
			return rs;  //return 0 as no rows were updated
			
		String queryString = new String("INSERT INTO " + STUDENT_TABLE_NAME + "(" + FIRST_NAME + "," 
										+ LAST_NAME + "," 
										+ EMAIL_ID + "," 
										+ PHONE_NUMBER + "," 
										+ ADDRESS_LINE_1 + "," 
										+ ADDRESS_LINE_2 + ","
										+ CITY + "," 
										+ STATE + "," 
										+ ZIPCODE + ")" 
										+ " VALUES" + "('" 
										+ studentInfo.getFirstName() +    "','" 
										+ studentInfo.getLastName() +     "','" 
										+ studentInfo.getEmailAddress() + "','" 
										+ studentInfo.getPhoneNumber() +  "','"
										+ studentInfo.getAddressLine1() + "','" 
										+ studentInfo.getAddressLine2() + "','" 
										+ studentInfo.getCity() +         "','" 
										+ studentInfo.getState() +        "','" 
										+ studentInfo.getZipcode()+ "');");     
		
		
		rs = FuelDB.executeUpdate(queryString);
		
		return rs;
		//Execute the query here keep the DB util class very dumb, just knowing msql and user id and password
	}
	
	
}