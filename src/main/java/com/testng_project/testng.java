package com.testng_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\ADACTIN\\Driver\\chromedriver_96.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	   
	}
	
	@Test
	public void Credentials() {
		// TODO Auto-generated method stub
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Aravind1008");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Arav@1019");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();

	}
	
	
	@AfterMethod
	public void teardown() {
		// TODO Auto-generated method stub
		driver.close();
		driver.quit();
	
	}
	
	
	

}
