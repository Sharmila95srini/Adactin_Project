package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	
	public WebDriver driver;
	
	@FindBy(id ="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement room;
	
	@FindBy(id="datepick_in")
	private WebElement check_in;
	
	@FindBy(id="datepick_out")
	private WebElement check_out;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement  search;
	
	public Search_hotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getCheck_in() {
		return check_in;
	}

	public WebElement getCheck_out() {
		return check_out;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
