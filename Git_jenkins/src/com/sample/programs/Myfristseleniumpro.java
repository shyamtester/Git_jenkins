package com.sample.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myfristseleniumpro {
public static void main(String[] args) {
	System.setProperty("webdriver.firefox.marionette", "D:\\shyam\\set ups\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	System.out.println("browser should be opened");
	driver.get("http://toolsqa.com/automation-practice-form/");
	
}
}
