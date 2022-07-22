package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
@Test 
public void launch () throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	String pageTitle = driver.getTitle();
	System.out.println("Page title is:" +pageTitle);
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(2000);
	System.out.println(driver.getPageSource());
	Thread.sleep(2000);
	
	            // Browser navigation //
//	driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
//	driver.manage().window().maximize();
//	String pageTitle = driver.getTitle();
//	System.out.println("Page title is:" +pageTitle);
//	Thread.sleep(2000);
//	driver.navigate().back();
//	Thread.sleep(2000);
//	driver.navigate().refresh();
//	Thread.sleep(2000);
//	driver.navigate().forward();
}
}
