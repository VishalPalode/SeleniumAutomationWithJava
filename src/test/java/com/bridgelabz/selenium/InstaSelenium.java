package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InstaSelenium {
@Test 
	public void login_signUp_Insta() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
//--------------------------------Login page-----------------------------------
		//username
		driver.findElement(By.name("username")).sendKeys("Vishal");
		Thread.sleep(2000);
		//password
		driver.findElement(By.name("password")).sendKeys("VP@123");	
		Thread.sleep(2000);
		//login button
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
		Thread.sleep(2000);
		//sign up link
		driver.findElement(By.linkText("Sign up")).click();	
		Thread.sleep(2000);
//-----------------------Sign up page---------------------------------- 		
		//*Login with Facebook*
//		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[1]/button")).click();	
//		Thread.sleep(2000);
		
		//**or**
		//1.Mobile number or Email
		driver.findElement(By.name("emailOrPhone")).sendKeys("Vishal@gmail.com");
		Thread.sleep(2000);
		//2.Full name
		driver.findElement(By.name("fullName")).sendKeys("Vishal Patil");
		Thread.sleep(2000);
		//3.username
		driver.findElement(By.name("username")).sendKeys("Vishal");
		Thread.sleep(2000);
		//4.password
		driver.findElement(By.name("password")).sendKeys("Vp@123");
		Thread.sleep(2000);
		//5.sign up button
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[7]/div/button")).click();
		Thread.sleep(2000);
	}
}
