package com.flipkart.ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;

public class Rough {

	public static void main(String[] args) 
	{
		WebDriver driver  = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		try{
		Screen sc = new Screen();
		
//		sc.find("C:\\JavaPrograms\\flipkart\\Screenshot\\searchButton.png");
//		sc.click("C:\\JavaPrograms\\flipkart\\Screenshot\\searchButton.png");
//		
		sc.find("C:\\JavaPrograms\\flipkart\\Screenshot\\signInButton.png");
		sc.click("C:\\JavaPrograms\\flipkart\\Screenshot\\signInButton.png");
		}
		catch(Exception e)
		{
			
		}
	}

}
