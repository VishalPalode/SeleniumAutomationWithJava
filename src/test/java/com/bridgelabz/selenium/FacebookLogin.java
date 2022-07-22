package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookLogin {
	@Test
public void login ()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		// For Login	
		//----------------Facebook-----------------------
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("vishalpalode9899@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("virapa");
		Thread.sleep(2000);
		//driver.findElement(By.name("login")).click();
	}
	@Test
public void CreateAccount ()throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Vishal");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Palode");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("vishal@gmail.com");
		Thread.sleep(2000);
		//re-enter email 
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vishal@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("vishal@123");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByVisibleText("9");
		Thread.sleep(2000);
        WebElement month = driver.findElement(By.id("month"));
        Select select1 = new Select(month);
        select1.selectByVisibleText("Aug");
        Thread.sleep(2000);
        WebElement year = driver.findElement(By.id("year"));        
        Select select2 = new Select(year);
        select2.selectByVisibleText("1999");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
}
}
