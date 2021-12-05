package com.runner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.utilityFile.Base_Class;

public class Runner extends Base_Class {
	
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		driver=getBrowser("chrome");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\Adactin_Project\\Driver");
//		ChromeOptions ch=new ChromeOptions();
//		ch.addArguments("incognito");
		//WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.com/");
		//driver.get("https://adactinhotelapp.com/");
		getUrl("https://www.google.com/");
		getUrl("https://adactinhotelapp.com/");
	//	driver.manage().window().maximize();
		max();
	   // driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	   wait(2);
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		//username.sendKeys("Aravind1008");
		input(username,"Aravind1008");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		//password.sendKeys("Arav@1019");
		input(password, "Arav@1019");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		//login.click();
		btn_click(login);
		WebElement location = driver.findElement(By.id("location"));
		SelectText(location, "Sydney");
//		Select s=new Select(location);
//	    s.selectByVisibleText("Sydney");
	    WebElement hotel = driver.findElement(By.id("hotels"));
//	    Select s1=new Select(hotel);
//	    s1.selectByVisibleText("Hotel Hervey");
	    SelectText(hotel, "Hotel Hervey");
	    WebElement type = driver.findElement(By.id("room_type"));
//	    Select s2=new Select(type);
//	    s2.selectByVisibleText("Super Deluxe");
	    SelectText(type, "Super Deluxe");
	    WebElement room = driver.findElement(By.id("room_nos"));
//	    Select s3=new Select(room);
//	    s3.selectByVisibleText("2 - Two");
	    SelectText(room, "2 - Two");
	    WebElement check_in = driver.findElement(By.id("datepick_in"));
//	    check_in.click();
	    btn_click(check_in);
	    WebElement check_out = driver.findElement(By.id("datepick_out"));
//	    check_out.click();
	    btn_click(check_out);
	    WebElement adult = driver.findElement(By.id("adult_room"));
//	    Select s4=new Select(adult);
//	    s4.selectByVisibleText("2 - Two");
	    SelectText(adult, "2 - Two");
	    WebElement child = driver.findElement(By.id("child_room"));
//	    Select s5=new Select(child);
//	    s5.selectByVisibleText("3 - Three");
	    SelectText(child, "3 - Three");
	    WebElement search = driver.findElement(By.id("Submit"));
//	    search.click();
	    btn_click(search);
	    WebElement radio_btn = driver.findElement(By.id("radiobutton_0"));
//	    radio_btn.click();
	    btn_click(radio_btn);
	    WebElement submit = driver.findElement(By.id("continue"));
//	    submit.click();
	    btn_click(submit);
	    WebElement frst_name = driver.findElement(By.id("first_name"));
//	    frst_name.sendKeys("Aravind");
	    input(frst_name,"Aravind" );
	    WebElement lst_name = driver.findElement(By.id("last_name"));
//	    lst_name.sendKeys("Sekar");
	    input(lst_name, "Sekar");
	    WebElement adrs = driver.findElement(By.id("address"));
//	    adrs.sendKeys("Bharatheshwarar Colony,Kodambakkam");
	    input(adrs, "Bharatheshwarar Colony,Kodambakkam");
	    WebElement cc_no = driver.findElement(By.id("cc_num"));
//	    cc_no.sendKeys("1322428815612036");
	    input(cc_no,"1322428815612036" );
	    WebElement cctype = driver.findElement(By.id("cc_type"));
//	    Select s6=new Select(cctype);
//	    s6.selectByVisibleText("VISA");
	    SelectText(cctype, "VISA");
	    WebElement cc_month = driver.findElement(By.id("cc_exp_month"));
//	    Select s7=new Select(cc_month);
//	    s7.selectByVisibleText("August");
	    SelectText(cc_month, "August");
	    WebElement cc_year = driver.findElement(By.id("cc_exp_year"));
//	    Select s8=new Select(cc_year);
//	    s8.selectByVisibleText("2022");
	    SelectText(cc_year,"2022" );
	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
//	    cvv.sendKeys("203");
	    input(cvv, "203");
	    WebElement book = driver.findElement(By.id("book_now"));
//	    book.click();
	    btn_click(book);
//	    JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,200);");
	    scroll();
	    WebElement bkdetails = driver.findElement(By.id("my_itinerary"));
//	    bkdetails.click();
	    btn_click(bkdetails);
	  //Thread.sleep(200);
// 		TakesScreenshot scrnshot=(TakesScreenshot) driver;
// 		File srce = scrnshot.getScreenshotAs(OutputType.FILE);
// 		File dest=new File("C:\\Users\\Aravind\\eclipse-workspace\\ADACTIN\\Screenshot\\booking.png");
// 		FileHandler.copy(srce, dest);
	    Screenshot();
 		WebElement lgout = driver.findElement(By.id("logout"));
// 		lgout.click();
 		btn_click(lgout);
//		driver.close();
 		close();
//		driver.quit();
	 quit();
	}

}
