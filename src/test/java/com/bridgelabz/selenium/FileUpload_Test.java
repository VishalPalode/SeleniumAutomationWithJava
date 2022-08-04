package com.bridgelabz.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload_Test {
	public static WebDriver driver;
	@BeforeTest
	public void launchrowser(){
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	    driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
}
	@Test
	public void autoIt_UploadFile() throws InterruptedException, IOException {
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Choose PDF file")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Documents\\fileupload.exe");
	}
	@Test
	public void file_Upload() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\Lenovo\\Documents\\Vishal.Resume.pdf");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@ng-click=\\\"item.upload()\\\"]")).click();
	//Thread.sleep(2000);
}
}