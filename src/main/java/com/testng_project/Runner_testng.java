package com.testng_project;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.propertyFile.File_Reader_Manager;
import com.sdp.Single_design;
import com.utilityFile.Base_Class;

public class Runner_testng extends Base_Class {
	
	
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static Single_design sd=new Single_design(driver);

	
	@BeforeSuite
		private void setup() throws Throwable {
			// TODO Auto-generated method stub
			String url1 = File_Reader_Manager.getFRM().getCR().getUrl1();
			getUrl(url1);
			String url2 = File_Reader_Manager.getFRM().getCR().getUrl2();
			getUrl(url2 );
			max();
		   wait(2);
		}
	
	@Test(timeOut = 2000,priority = 0)
	private void Credentials() throws Throwable {
		// TODO Auto-generated method stub
		 String username = File_Reader_Manager.getFRM().getCR().Username();
			input(sd.getS().getUsername(),username);
			String password = File_Reader_Manager.getFRM().getCR().Password();
			input(sd.getS().getPassword(), password);
			btn_click(sd.getS().getLogin());
	}
	@Test(groups = "Resort",priority = 1)
	
	private void Search_hotel() throws Throwable {
		// TODO Auto-generated method stub
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
	}
	  @Test(groups = "Resort", priority = 2)
	  private void book_hotel() throws Throwable   {
		// TODO Auto-generated method stub

		    btn_click(sd.getHtl().getRadio_btn());
		    btn_click(sd.getHtl().getSubmit());
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

	}
	  @Test(timeOut = 80000, priority = 3)
	   private void booking_Confirm() throws IOException  {
		// TODO Auto-generated method stub
		  scroll();
		    btn_click(sd.getBC().getBkdetails());
		  	    
	 		
	}
	  
	 @Test(invocationCount = 3,timeOut = 80000,priority = 4)
	  private void takepic() throws IOException {
		// TODO Auto-generated method stub
		  Screenshot();

	}
	  
	  @Test(timeOut = 50000, priority = 5)
	   private void logout() {
		// TODO Auto-generated method stub
		   btn_click(sd.getBI().getLgout());

	}
	    @AfterSuite(timeOut = 50000)
	  private void teardown() {
		// TODO Auto-generated method stub
		  close();
		    quit();

	}
	    
	

}
