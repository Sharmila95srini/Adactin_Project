package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomClass.Book_hotel;
import com.pomClass.Booked_Itinerary;
import com.pomClass.Booking_confirm;
import com.pomClass.Search_hotel;
import com.pomClass.Select_hotel;
import com.pomClass.Sign_in;

public class Single_design {
	
	public  WebDriver driver;
	
	public Single_design(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	private Sign_in s; 
	private Select_hotel htl;
	private Search_hotel SH;
	private Book_hotel BH;
	private Booking_confirm BC;
	private Booked_Itinerary BI;
	
	public WebDriver getDriver() {
		return driver;
	}
	public Sign_in getS() {
		if(s==null) {
			
			s=new Sign_in(driver);
		}
		
		return s;
	}
	public Select_hotel getHtl() {
		if(htl==null) {
			htl=new Select_hotel(driver);
		}
		return htl;
	}
	public Search_hotel getSH() {
		if(SH==null) {
			
			SH=new Search_hotel(driver);
		}
		
		return SH;
	}
	public Book_hotel getBH() {
		
		if(BH==null) {
			BH=new Book_hotel(driver);
		}
		return BH;
	}
	public Booking_confirm getBC() {
		if(BC==null) {
			BC=new Booking_confirm(driver);
		}
		return BC;
	}
	public Booked_Itinerary getBI() {
		if(BI==null) {
			BI=new Booked_Itinerary(driver);
		}
		return BI;
	}

	
	

}
