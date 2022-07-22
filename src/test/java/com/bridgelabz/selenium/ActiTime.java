package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiTime {
@Test
public void login ()throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("C:\\ActiTime.html");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("Vishal");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("VishalP");
}
}