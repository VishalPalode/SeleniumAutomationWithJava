package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookVarifyUsingURL {
@Test
public void VarifyHomeUsingURL ()throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vishal@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vishal@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
	Thread.sleep(2000);
	String expectedTitle = "Facebook";
	String actualTitle = driver.getTitle();
	System.out.println("Actual result is: " );
	Thread.sleep(2000);
	if (actualTitle.contains(expectedTitle)) {
		System.out.println("expected page is displayed");
	}
	else 
	{
		System.out.println("expected page is not displayed");
	}
}
}