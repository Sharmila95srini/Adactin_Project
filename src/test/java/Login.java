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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aravind\\eclipse-workspace\\ADACTIN\\Driver\\chromedriver_96.exe");
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("incognito");
		WebDriver driver=new ChromeDriver(ch);
		driver.get("https://www.google.com/");
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
	    
	   
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Aravind1008");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Arav@1019");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
	    s.selectByVisibleText("Sydney");
	    WebElement hotel = driver.findElement(By.id("hotels"));
	    Select s1=new Select(hotel);
	    s1.selectByVisibleText("Hotel Hervey");
	    WebElement type = driver.findElement(By.id("room_type"));
	    Select s2=new Select(type);
	    s2.selectByVisibleText("Super Deluxe");
	    WebElement room = driver.findElement(By.id("room_nos"));
	    Select s3=new Select(room);
	    s3.selectByVisibleText("2 - Two");
	    WebElement check_in = driver.findElement(By.id("datepick_in"));
	    check_in.click();
	    WebElement check_out = driver.findElement(By.id("datepick_out"));
	    check_out.click();
	    WebElement adult = driver.findElement(By.id("adult_room"));
	    Select s4=new Select(adult);
	    s4.selectByVisibleText("2 - Two");
	    WebElement child = driver.findElement(By.id("child_room"));
	    Select s5=new Select(child);
	    s5.selectByVisibleText("3 - Three");
	    WebElement search = driver.findElement(By.id("Submit"));
	    search.click();
	    
	    
	    WebElement radio_btn = driver.findElement(By.id("radiobutton_0"));
	    radio_btn.click();
	    WebElement submit = driver.findElement(By.id("continue"));
	    submit.click();
	    WebElement frst_name = driver.findElement(By.id("first_name"));
	    frst_name.sendKeys("Aravind");
	    WebElement lst_name = driver.findElement(By.id("last_name"));
	    lst_name.sendKeys("Sekar");
	    WebElement adrs = driver.findElement(By.id("address"));
	    adrs.sendKeys("Bharatheshwarar Colony,Kodambakkam");
	    WebElement cc_no = driver.findElement(By.id("cc_num"));
	    cc_no.sendKeys("1322428815612036");
	    WebElement cctype = driver.findElement(By.id("cc_type"));
	    Select s6=new Select(cctype);
	    s6.selectByVisibleText("VISA");
	    WebElement cc_month = driver.findElement(By.id("cc_exp_month"));
	    Select s7=new Select(cc_month);
	    s7.selectByVisibleText("August");
	    WebElement cc_year = driver.findElement(By.id("cc_exp_year"));
	    Select s8=new Select(cc_year);
	    s8.selectByVisibleText("2022");
	    WebElement cvv = driver.findElement(By.id("cc_cvv"));
	    cvv.sendKeys("203");
	    WebElement book = driver.findElement(By.id("book_now"));
	    book.click();
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200);");
	    WebElement bkdetails = driver.findElement(By.id("my_itinerary"));
	    bkdetails.click();
	  //Thread.sleep(200);
 		TakesScreenshot scrnshot=(TakesScreenshot) driver;
 		File srce = scrnshot.getScreenshotAs(OutputType.FILE);
 		File dest=new File("C:\\Users\\Aravind\\eclipse-workspace\\ADACTIN\\Screenshot\\booking.png");
 		FileHandler.copy(srce, dest);
 		WebElement lgout = driver.findElement(By.id("logout"));
 		lgout.click();
		driver.close();
		driver.quit();
	
	}

}
