package com.testng_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Adactin_testng {
	
	
   public static WebDriver driver;
    
    @BeforeTest

    @Parameters("drivername")
    	public static WebDriver getBrowser(String drivername) {
    		
    		if(drivername.equalsIgnoreCase("chrome")) 
    		{
    		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Driver//chromedriver_96.exe");
    		driver=new ChromeDriver();
    		}
    		else if(drivername.equalsIgnoreCase("firefox"))
    		{
    		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ ("//driver//geckodriver.exe"));
    		driver=new FirefoxDriver();
    		}
    		return driver;
    		}
    	
    @Test(priority = 1)
    public void test1() {
		// TODO Auto-generated method stub
    	driver.get("https://www.google.com/");
		driver.get("https://adactinhotelapp.com/");
    	
	}
   
    
      @AfterTest
	public void teardown() {
		// TODO Auto-generated method stub
    driver.close();
    driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
}
