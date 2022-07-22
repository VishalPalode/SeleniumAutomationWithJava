package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_Xpath {
	@Test

	public void login ()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vishal@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vishal@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(2000);
}
	@Test
	public void CreateAccount () throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a [text ()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Vishal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Patil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vishal@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("vishal@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("vishal@123");
		Thread.sleep(2000);
		WebElement dateElement= driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		WebElement monthElement = driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		WebElement yearElement = driver.findElement(By.xpath("//*[@id='year']"));
		Thread.sleep(2000);
		
		Select dateDropdown = new Select(dateElement); 
		Select monthDropdown = new Select(monthElement);
		Select yearDropdown = new Select(yearElement);
		
		dateDropdown.selectByVisibleText("9");
		monthDropdown.selectByVisibleText("Aug");
		yearDropdown.selectByVisibleText("1999");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		//driver.close();
	}
}