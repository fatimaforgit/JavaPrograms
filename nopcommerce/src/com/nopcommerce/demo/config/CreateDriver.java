package com.nopcommerce.demo.config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.nopcommerce.demo.util.Helper;

public class CreateDriver 
{
	
	public static WebDriver getDriver()
	{
		String browser_name = Helper.getExcelData("TestData", "DataSheet" , 1, 2);
		String url = Helper.getExcelData("TestData", "DataSheet" , 1, 3);
		String currentProjectPath = System.getProperty("user.dir"); // gets current path of project
		
		WebDriver driver=null;

		if(browser_name.equalsIgnoreCase("FFD"))
		{
			driver= new FirefoxDriver();
		}
		else if(browser_name.equalsIgnoreCase("CD"))
		{
			System.setProperty("webdriver.chrome.driver", currentProjectPath+"\\BrowserExe\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("IeD"))
		{
			System.setProperty("webdriver.ie.driver", currentProjectPath+"\\BrowserExe\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		
		return driver;
		
	}

}
