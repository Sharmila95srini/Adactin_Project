package com.utilityFile;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;

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
	
	 public static  void getUrl(String URL) {
		   
	  driver.get(URL);
    }
	 
	
	public static void max() {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
	}
	public static void wait(int time) {
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.MINUTES);
	}
	public static void input(WebElement element,String  value) {
		// TODO Auto-generated method stub
    element.sendKeys(value);
	}
	//SelectByValue
	   public static void Selectvalue(WebElement select,String OptionSelect) {
		   Select s1=new Select(select);
		   s1.selectByValue(OptionSelect);
	    }
	   //SelectByText
	   public static void SelectText(WebElement select, String OptionSelect) {
		   Select s2=new Select(select);
		   s2.selectByVisibleText(OptionSelect);
		}
	   //SelectBy
	   public static void SelectIndex(WebElement select, int OptionSelect) {
		   Select s3=new Select(select);
		   s3.selectByIndex(OptionSelect);
		}
	  
	public static void btn_click(WebElement element) {
		// TODO Auto-generated method stub
     element.click();
	}
	public static  void scroll() {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript(null, args)
		js.executeScript("window.scrollBy(0,200);");
	}
	public static void Screenshot() throws IOException {
		// TODO Auto-generated method stub
		TakesScreenshot scrnshot=(TakesScreenshot) driver;
 		File srce = scrnshot.getScreenshotAs(OutputType.FILE);
 		File dest=new File("C:\\Users\\Aravind\\eclipse-workspace\\Adactin_Project\\Screenshots\\booking.png");
 		FileHandler.copy(srce, dest);
	}
	
	public static void close() {
		// TODO Auto-generated method stub
       driver.close();
	}
	public static void quit() {
		// TODO Auto-generated method stub
   driver.quit();
	}
}
