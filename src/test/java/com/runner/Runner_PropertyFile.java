package com.runner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
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

import com.logger.Logger_AP;
import com.sdp.Single_design;
import com.utilityFile.Base_Class;

public class Runner_PropertyFile extends Base_Class {
	
	
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static Single_design sd=new Single_design(driver);
	
	
//	public static Sign_in s =new Sign_in(driver);
//	public static Select_hotel htl=new Select_hotel(driver);
//	public static Search_hotel SH=new Search_hotel(driver);
//	public static Book_hotel BH=new Book_hotel(driver);
//	public static Booking_confirm BC=new Booking_confirm(driver);
//	public static Booked_Itinerary BI=new Booked_Itinerary(driver);
	
	public static void main(String[] args) throws Throwable {
		
//		driver=getBrowser("chrome");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\Adactin_Project\\Driver");
//		ChromeOptions ch=new ChromeOptions();
//		ch.addArguments("incognito");
		//WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.com/");
		//driver.get("https://adactinhotelapp.com/");
		String url1 = File_Reader_Manager.getFRM().getCR().getUrl1();
		getUrl(url1);
		String url2 = File_Reader_Manager.getFRM().getCR().getUrl2();
		getUrl(url2 );
	//	driver.manage().window().maximize();
		max();
	   // driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	   wait(2);
	
		//WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	      
		//username.sendKeys("Aravind1008");
	   String username = File_Reader_Manager.getFRM().getCR().Username();
		input(sd.getS().getUsername(),username);
//		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		//password.sendKeys("Arav@1019");
		String password = File_Reader_Manager.getFRM().getCR().Password();
		input(sd.getS().getPassword(), password);
//		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		//login.click();
		btn_click(sd.getS().getLogin());
//		WebElement location = driver.findElement(By.id("location"));
		String location = File_Reader_Manager.getFRM().getCR().Location();
		SelectText(sd.getSH().getLocation(), location);
//		Select s=new Select(location);
//	    s.selectByVisibleText("Sydney");
//	    WebElement hotel = driver.findElement(By.id("hotels"));
//	    Select s1=new Select(hotel);
//	    s1.selectByVisibleText("Hotel Hervey");
		String hotel = File_Reader_Manager.getFRM().getCR().Hotel();
	    SelectText(sd.getSH().getHotels(), hotel);
//	    WebElement type = driver.findElement(By.id("room_type"));
//	    Select s2=new Select(type);
//	    s2.selectByVisibleText("Super Deluxe");
	    String room_type = File_Reader_Manager.getFRM().getCR().Room_type();
	    SelectText(sd.getSH().getRoom_type(),room_type);
//	    WebElement room = driver.findElement(By.id("room_nos"));
//	    Select s3=new Select(room);
//	    s3.selectByVisibleText("2 - Two");
	    String room = File_Reader_Manager.getFRM().getCR().Room();
	    SelectText(sd.getSH().getRoom(), room);
//	    WebElement check_in = driver.findElement(By.id("datepick_in"));
//	    check_in.click();
	    btn_click(sd.getSH().getCheck_in());
//	    WebElement check_out = driver.findElement(By.id("datepick_out"));
//	    check_out.click();
	    btn_click(sd.getSH().getCheck_out());
//	    WebElement adult = driver.findElement(By.id("adult_room"));
//	    Select s4=new Select(adult);
//	    s4.selectByVisibleText("2 - Two");
	    String adult = File_Reader_Manager.getFRM().getCR().Adult();
	    SelectText(sd.getSH().getAdult(), adult);
//	    WebElement child = driver.findElement(By.id("child_room"));
//	    Select s5=new Select(child);
//	    s5.selectByVisibleText("3 - Three");
	    String child = File_Reader_Manager.getFRM().getCR().Child();
	    SelectText(sd.getSH().getChild(), child);
//	    WebElement search = driver.findElement(By.id("Submit"));
//	    search.click();
	    btn_click(sd.getSH().getSearch());
//	    WebElement radio_btn = driver.findElement(By.id("radiobutton_0"));
//	    radio_btn.click();
	    btn_click(sd.getHtl().getRadio_btn());
//	    WebElement submit = driver.findElement(By.id("continue"));
//	    submit.click();
	    btn_click(sd.getHtl().getSubmit());
//	    WebElement frst_name = driver.findElement(By.id("first_name"));
//	    frst_name.sendKeys("Aravind");
	    String firstName = File_Reader_Manager.getFRM().getCR().FirstName();
	    input(sd.getBH().getFrst_name(),firstName );
//	    WebElement lst_name = driver.findElement(By.id("last_name"));
//	    lst_name.sendKeys("Sekar");
	    String lastName = File_Reader_Manager.getFRM().getCR().LastName();
	    input(sd.getBH().getLst_name(), lastName);
//	    WebElement adrs = driver.findElement(By.id("address"));
//	    adrs.sendKeys("Bharatheshwarar Colony,Kodambakkam");
	    String address = File_Reader_Manager.getFRM().getCR().Address();
	    input(sd.getBH().getAdrs(), address);
//	    WebElement cc_no = driver.findElement(By.id("cc_num"));
//	    cc_no.sendKeys("1322428815612036");
	    String cc_No = File_Reader_Manager.getFRM().getCR().CC_No();
	    input(sd.getBH().getCc_no(),cc_No );
//	    WebElement cctype = driver.findElement(By.id("cc_type"));
//	    Select s6=new Select(cctype);
//	    s6.selectByVisibleText("VISA");
	    String cCtype = File_Reader_Manager.getFRM().getCR().CCtype();
	    SelectText(sd.getBH().getCctype(), cCtype);
//	    WebElement cc_month = driver.findElement(By.id("cc_exp_month"));
//	    Select s7=new Select(cc_month);
//	    s7.selectByVisibleText("August");
	    String cc_month = File_Reader_Manager.getFRM().getCR().CC_month();
	    SelectText(sd.getBH().getCc_month(), cc_month);
//	    WebElement cc_year = driver.findElement(By.id("cc_exp_year"));
//	    Select s8=new Select(cc_year);
//	    s8.selectByVisibleText("2022");
	    String cc_year = File_Reader_Manager.getFRM().getCR().CC_year();
	    SelectText(sd.getBH().getCc_year(),cc_year );
//	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
//	    cvv.sendKeys("203");
	    String cvv = File_Reader_Manager.getFRM().getCR().Cvv();
	    input(sd.getBH().getCvv(), cvv);
//	    WebElement book = driver.findElement(By.id("book_now"));
//	    book.click();
	    btn_click(sd.getBH().getBook());
//	    JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,200);");
	    scroll();
//	    WebElement bkdetails = driver.findElement(By.id("my_itinerary"));
//	    bkdetails.click();
	    btn_click(sd.getBC().getBkdetails());
	  //Thread.sleep(200);
// 		TakesScreenshot scrnshot=(TakesScreenshot) driver;
// 		File srce = scrnshot.getScreenshotAs(OutputType.FILE);
// 		File dest=new File("C:\\Users\\Aravind\\eclipse-workspace\\ADACTIN\\Screenshot\\booking.png");
// 		FileHandler.copy(srce, dest);
	    Screenshot();
// 		WebElement lgout = driver.findElement(By.id("logout"));
// 		lgout.click();
 		btn_click(sd.getBI().getLgout());
//		driver.close();
 		close();
//		driver.quit();
	 quit();
	}

}
