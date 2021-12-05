package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Runner_testng {

	WebDriver driver;
	
	@BeforeSuite
private void launchBrowser() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\Adactin_Project\\Driver");
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("incognito");
	WebDriver driver=new ChromeDriver(ch);
}
  @Test(groups = {"Url"})
private void opengoogle() {
	// TODO Auto-generated method stub
	driver.get("https://www.google.com/");
	
}
  @Test(groups = {"Url"})
	private void getUrl() {
		// TODO Auto-generated method stub
		driver.get("https://adactinhotelapp.com/");
	}
  
  @Test(groups= {"Credentials"})
	
	private void username() {
		// TODO Auto-generated method stub

	}
  @Test(groups= {"Credentials"})
	private void password() {
		// TODO Auto-generated method stub

	}
  @Test(groups= {"Credentials"})
	private void login() {
		// TODO Auto-generated method stub

	}
  @AfterSuite
  private void closeBrowser() {
	// TODO Auto-generated method stub
    driver.quit();
}
	
}
