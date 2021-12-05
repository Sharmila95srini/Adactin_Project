package com.propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	
	public Configuration_Reader() throws Throwable {
		// TODO Auto-generated constructor stub
		
		File f=new File("C:\\Users\\Aravind\\eclipse-workspace\\Adactin_Project\\src\\main\\java\\com\\propertyFile\\Configure_Properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		 p.load(fis);
	}
	
	public String getUrl1() {
		String url = p.getProperty("Url1");
		return url;
		// TODO Auto-generated method stub

	}
	public String getUrl2() {
		// TODO Auto-generated method stub
		String url2 = p.getProperty("Url2");
		return url2;		

	}
	public String Username() {
		// TODO Auto-generated method stub
		String username = p.getProperty("Username");
		return username;

	}
	public String  Password() {
		// TODO Auto-generated method stub
		String pass = p.getProperty("Password");
		return pass;

	}
	public String Location() {
		// TODO Auto-generated method stub
		String loc = p.getProperty("Location");
		return loc;
		

	}
	public String Hotel() {
		// TODO Auto-generated method stub
		String hotel = p.getProperty("Hotel");
		return hotel;
		

	}
   public String Room_type() {
		// TODO Auto-generated method stub
	   String roomtype = p.getProperty("Room_type");
	return roomtype;

	}
	public String Room() {
		// TODO Auto-generated method stub
		String room = p.getProperty("Room");
		return room;

	}
	public String Adult() {
		// TODO Auto-generated method stub
		String adult = p.getProperty("Adult");
		return adult;

	}
	public String Child() {
		// TODO Auto-generated method stub
		String child = p.getProperty("Child");
		return child;

	}
	public String FirstName() {
		// TODO Auto-generated method stub
		String frst = p.getProperty("FirstName");
		return frst;
		

	}
	public String LastName() {
		// TODO Auto-generated method stub
   String lst = p.getProperty("LastName");
   return lst;
	}
   public String Address() {
		// TODO Auto-generated method stub
	   String addrs = p.getProperty("Address");
	return addrs;

	}
	public String CC_No() {
		// TODO Auto-generated method stub
     String cc = p.getProperty("CC_No");
	return cc;
	}
	public String CCtype() {
		// TODO Auto-generated method stub
     String CC_type = p.getProperty("CCtype");
	return CC_type;
	}
	public String CC_month() {
		// TODO Auto-generated method stub
		String ccmonth = p.getProperty("CC_month");
		return ccmonth;

	}
	public String CC_year() {
		// TODO Auto-generated method stub
		String ccyear = p.getProperty("CC_year");
		return ccyear;

	}
	public String Cvv() {
		// TODO Auto-generated method stub
		String cvv = p.getProperty("Cvv");
		return cvv;

	}

}
