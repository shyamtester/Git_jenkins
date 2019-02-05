package com.sample.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Myfristseleniumpro {
	@Test
public void testA(){
	System.setProperty("webdriver.firefox.marionette", "C:\\Users\\jobs\\git\\repository3\\Git_jenkins\\drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	System.out.println("browser should be opened");
	driver.get("http://toolsqa.com/automation-practice-form/");
	
}
}
