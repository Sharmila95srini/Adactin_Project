package com.logger;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
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
import com.propertyFile.File_Reader_Manager;
import com.sdp.Single_design;
import com.utilityFile.Base_Class;
public class Runner_log extends Base_Class {
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static Single_design sd=new Single_design(driver);
	static Logger log=Logger.getLogger(Runner_log.class);
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");		
		log.info("Browser Launch");
		String url1 = File_Reader_Manager.getFRM().getCR().getUrl1();
		getUrl(url1);
		String url2 = File_Reader_Manager.getFRM().getCR().getUrl2();
		getUrl(url2 );
		max();
	   wait(2);	
	  log.info("Enter credentials");
	   String username = File_Reader_Manager.getFRM().getCR().Username();
		input(sd.getS().getUsername(),username);
		String password = File_Reader_Manager.getFRM().getCR().Password();
		input(sd.getS().getPassword(), password);
		btn_click(sd.getS().getLogin());
    	log.info(" Navigate to Search_Hotel Page");
		String location = File_Reader_Manager.getFRM().getCR().Location();
		SelectText(sd.getSH().getLocation(), location);
		String hotel = File_Reader_Manager.getFRM().getCR().Hotel();
	    SelectText(sd.getSH().getHotels(), hotel);
	    String room_type = File_Reader_Manager.getFRM().getCR().Room_type();
	    SelectText(sd.getSH().getRoom_type(),room_type);
	    String room = File_Reader_Manager.getFRM().getCR().Room();
	    SelectText(sd.getSH().getRoom(), room);
	    btn_click(sd.getSH().getCheck_in());
	    btn_click(sd.getSH().getCheck_out());
	    String adult = File_Reader_Manager.getFRM().getCR().Adult();
	    SelectText(sd.getSH().getAdult(), adult);
	    String child = File_Reader_Manager.getFRM().getCR().Child();
	    SelectText(sd.getSH().getChild(), child);
	    btn_click(sd.getSH().getSearch());
	    btn_click(sd.getHtl().getRadio_btn());
	    btn_click(sd.getHtl().getSubmit());
	    log.info("Navigate to Book_Hotel Page");
	    String firstName = File_Reader_Manager.getFRM().getCR().FirstName();
	    input(sd.getBH().getFrst_name(),firstName );
	    String lastName = File_Reader_Manager.getFRM().getCR().LastName();
	    input(sd.getBH().getLst_name(), lastName);
	    String address = File_Reader_Manager.getFRM().getCR().Address();
	    input(sd.getBH().getAdrs(), address);
	    String cc_No = File_Reader_Manager.getFRM().getCR().CC_No();
	    input(sd.getBH().getCc_no(),cc_No );
	    String cCtype = File_Reader_Manager.getFRM().getCR().CCtype();
	    SelectText(sd.getBH().getCctype(), cCtype);
	    String cc_month = File_Reader_Manager.getFRM().getCR().CC_month();
	    SelectText(sd.getBH().getCc_month(), cc_month);
	    String cc_year = File_Reader_Manager.getFRM().getCR().CC_year();
	    SelectText(sd.getBH().getCc_year(),cc_year );
	    String cvv = File_Reader_Manager.getFRM().getCR().Cvv();
	    input(sd.getBH().getCvv(), cvv);
	    btn_click(sd.getBH().getBook());
	    scroll();
	    log.info("Bookin_Confirmation");
	    btn_click(sd.getBC().getBkdetails());
	    log.info("Take Screeshot");
	    Screenshot();
	    log.info("Logout");
 		btn_click(sd.getBI().getLgout());
 		close();
    	 quit();
	}

}
