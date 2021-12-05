package com.cucumber_testrunner;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utilityFile.Base_Class;

import cucumber.api.CucumberOptions;


@RunWith(Cucu.class)
@CucumberOptions(
	features="src\\main\\java\\com\\cucumber_featurefile\\Adactin.feature",
	glue="com.cucumber_stepdefinition")

public class Test_Runner {
	
	public static WebDriver driver;
	
	private void set_Up() {
		// TODO Auto-generated method stub
		driver=Base_Class.getBrowser("chrome");

	}
	private void tear_Down() {
		// TODO Auto-generated method stub
		driver.close();

	}

}
