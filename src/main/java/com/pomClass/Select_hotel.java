package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {
	
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio_btn;
	
	@FindBy(id="continue")
	private WebElement submit;
	
	public Select_hotel(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
