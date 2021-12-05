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

public class Runner_Pom extends Base_Class {
	
	
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static Sign_in s =new Sign_in(driver);
	public static Select_hotel htl=new Select_hotel(driver);
	public static Search_hotel SH=new Search_hotel(driver);
	public static Book_hotel BH=new Book_hotel(driver);
	public static Booking_confirm BC=new Booking_confirm(driver);
	public static Booked_Itinerary BI=new Booked_Itinerary(driver);
	
	public static void main(String[] args) throws Throwable {
		
//		driver=getBrowser("chrome");
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
	
		//WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	      
		//username.sendKeys("Aravind1008");
		input(s.getUsername(),"Aravind1008");
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		//password.sendKeys("Arav@1019");
		input(s.getPassword(), "Arav@1019");
//		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		//login.click();
		btn_click(s.getLogin());
//		WebElement location = driver.findElement(By.id("location"));
		SelectText(SH.getLocation(), "Sydney");
//		Select s=new Select(location);
//	    s.selectByVisibleText("Sydney");
//	    WebElement hotel = driver.findElement(By.id("hotels"));
//	    Select s1=new Select(hotel);
//	    s1.selectByVisibleText("Hotel Hervey");
	    SelectText(SH.getHotels(), "Hotel Hervey");
//	    WebElement type = driver.findElement(By.id("room_type"));
//	    Select s2=new Select(type);
//	    s2.selectByVisibleText("Super Deluxe");
	    SelectText(SH.getRoom_type(), "Super Deluxe");
//	    WebElement room = driver.findElement(By.id("room_nos"));
//	    Select s3=new Select(room);
//	    s3.selectByVisibleText("2 - Two");
	    SelectText(SH.getRoom(), "2 - Two");
//	    WebElement check_in = driver.findElement(By.id("datepick_in"));
//	    check_in.click();
	    btn_click(SH.getCheck_in());
//	    WebElement check_out = driver.findElement(By.id("datepick_out"));
//	    check_out.click();
	    btn_click(SH.getCheck_out());
//	    WebElement adult = driver.findElement(By.id("adult_room"));
//	    Select s4=new Select(adult);
//	    s4.selectByVisibleText("2 - Two");
	    SelectText(SH.getAdult(), "2 - Two");
//	    WebElement child = driver.findElement(By.id("child_room"));
//	    Select s5=new Select(child);
//	    s5.selectByVisibleText("3 - Three");
	    SelectText(SH.getChild(), "3 - Three");
//	    WebElement search = driver.findElement(By.id("Submit"));
//	    search.click();
	    btn_click(SH.getSearch());
//	    WebElement radio_btn = driver.findElement(By.id("radiobutton_0"));
//	    radio_btn.click();
	    btn_click(htl.getRadio_btn());
//	    WebElement submit = driver.findElement(By.id("continue"));
//	    submit.click();
	    btn_click(htl.getSubmit());
//	    WebElement frst_name = driver.findElement(By.id("first_name"));
//	    frst_name.sendKeys("Aravind");
	    input(BH.getFrst_name(),"Aravind" );
//	    WebElement lst_name = driver.findElement(By.id("last_name"));
//	    lst_name.sendKeys("Sekar");
	    input(BH.getLst_name(), "Sekar");
//	    WebElement adrs = driver.findElement(By.id("address"));
//	    adrs.sendKeys("Bharatheshwarar Colony,Kodambakkam");
	    input(BH.getAdrs(), "Bharatheshwarar Colony,Kodambakkam");
//	    WebElement cc_no = driver.findElement(By.id("cc_num"));
//	    cc_no.sendKeys("1322428815612036");
	    input(BH.getCc_no(),"1322428815612036" );
//	    WebElement cctype = driver.findElement(By.id("cc_type"));
//	    Select s6=new Select(cctype);
//	    s6.selectByVisibleText("VISA");
	    SelectText(BH.getCctype(), "VISA");
//	    WebElement cc_month = driver.findElement(By.id("cc_exp_month"));
//	    Select s7=new Select(cc_month);
//	    s7.selectByVisibleText("August");
	    SelectText(BH.getCc_month(), "August");
//	    WebElement cc_year = driver.findElement(By.id("cc_exp_year"));
//	    Select s8=new Select(cc_year);
//	    s8.selectByVisibleText("2022");
	    SelectText(BH.getCc_year(),"2022" );
//	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
//	    cvv.sendKeys("203");
	    input(BH.getCvv(), "203");
//	    WebElement book = driver.findElement(By.id("book_now"));
//	    book.click();
	    btn_click(BH.getBook());
//	    JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,200);");
	    scroll();
//	    WebElement bkdetails = driver.findElement(By.id("my_itinerary"));
//	    bkdetails.click();
	    btn_click(BC.getBkdetails());
	  //Thread.sleep(200);
// 		TakesScreenshot scrnshot=(TakesScreenshot) driver;
// 		File srce = scrnshot.getScreenshotAs(OutputType.FILE);
// 		File dest=new File("C:\\Users\\Aravind\\eclipse-workspace\\ADACTIN\\Screenshot\\booking.png");
// 		FileHandler.copy(srce, dest);
	    Screenshot();
// 		WebElement lgout = driver.findElement(By.id("logout"));
// 		lgout.click();
 		btn_click(BI.getLgout());
//		driver.close();
 		close();
//		driver.quit();
	 quit();
	}

}
