package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElement_Interface_Methods {
	@Test
	public void VerifyFB_GetLocationMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.xpath("//input[@type='text']"));
		// get the y-coordinate of username field
		int username_Ycordinate = unTB.getLocation().getY();
		System.out.println(username_Ycordinate);
		WebElement pwdTB = driver.findElement(By.xpath("//input[@type='password']"));
		// get the y-coordinate of password field
		int password_Ycordinate = pwdTB.getLocation().getY();
		System.out.println(password_Ycordinate);
		//check whether the Y-coordinate of username and password field are same
		if (username_Ycordinate==password_Ycordinate) {
			System.out.println("Both username and password fields are displayed in the same row");
		}else{
			System.out.println("username and password fields are NOT aligned in the same row");
		}
	}
	@Test
	public void HeightAndWidth() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//find the username field 
		WebElement unTB = driver.findElement(By.xpath("//input[@type='text']"));
		//store the height of username 
		int username_height = unTB.getSize().getHeight();
		//store the width of username 
		int username_width = unTB.getSize().getWidth();
		System.out.println(username_height);
		System.out.println(username_width);
		//find the password field
		WebElement pwdTB = driver.findElement(By.xpath("//input[@type='password']"));
		//store the height of password
		int password_height = pwdTB.getSize().getHeight();
		//store the width of password
		int password_width = pwdTB.getSize().getWidth();
		System.out.println(password_height);
		System.out.println(password_width);
		//check the height and width of username and password fields are same 
		if (username_height==password_height && username_width==password_width) {
			System.out.println("Username and password fields are aligned");
		}else{
			System.out.println("Username and password fields are NOT aligned");
		}
	}
	@Test
	public void UsernameField_LessThan_MobNoField() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.xpath("//input[@type='text']"));
		int username_width = unTB.getSize().getWidth();
		System.out.println(username_width);
		//Identify the mobile number text box
		WebElement mobileNumTB = driver.findElement(By.xpath("//input[contains(@aria-label,'Email address or phone number')]"));
		int mobNumWidth = mobileNumTB.getSize().getWidth();
		System.out.println(mobNumWidth);
		//Compare the width of both username and mobilenumber text box
		if (username_width==mobNumWidth) {
		System.out.println("Size of Both username and password fields are same" +username_width+" = " + mobNumWidth);
		}else{
		System.out.println("Size of username and password fields are NOT same that is : " 
		+username_width+" Not equals to " + mobNumWidth);
		}
	}
}




