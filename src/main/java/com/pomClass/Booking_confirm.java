package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_confirm {

	
	@FindBy(id="my_itinerary")
	private WebElement bkdetails;
			
	public WebDriver driver;
	
	public Booking_confirm(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getBkdetails() {
		return bkdetails;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
}
