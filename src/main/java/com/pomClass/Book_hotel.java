package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
	
	@FindBy(id="first_name")
	private WebElement frst_name;
	
	@FindBy(id="last_name")
	private WebElement lst_name;
	
	@FindBy(id="address")
	private WebElement adrs;
	
	@FindBy(id="cc_num")
	private WebElement cc_no;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cc_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement cc_year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
public WebDriver driver;
	
	public Book_hotel(WebDriver driver2) {
	// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
}

	public WebElement getFrst_name() {
		return frst_name;
	}

	public WebElement getLst_name() {
		return lst_name;
	}

	public WebElement getAdrs() {
		return adrs;
	}

	public WebElement getCc_no() {
		return cc_no;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCc_month() {
		return cc_month;
	}

	public WebElement getCc_year() {
		return cc_year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	
	

}
