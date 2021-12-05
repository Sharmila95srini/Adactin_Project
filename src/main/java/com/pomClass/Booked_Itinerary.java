package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {

	@FindBy(id="logout")
	private WebElement lgout;
	
	public WebDriver driver;
	
	

public Booked_Itinerary(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	}

public WebElement getLgout() {
	return lgout;
}

public WebDriver getDriver() {
	return driver;
}
	
	
}
