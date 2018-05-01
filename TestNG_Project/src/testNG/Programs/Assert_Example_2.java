package testNG.Programs;
// Goto gmail.com and verify if username text box has text "Enter your email"

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class Assert_Example_2 
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
	}
	
	//actual text does not match with expected
	@Test
	public void TestUsernameTextIsFalse()
	{		
		String expectedText = "Enter your *** email" ;
		String actualText = driver.findElement(By.id("Email")).getAttribute("placeholder");
		System.out.println("test case will fail");
		Assert.assertEquals(actualText, expectedText);
				
		driver.close();
		
	}	
	
	//actual text match with expected
	@Test
	public void TestUsernameTextIsTrue()
	{
		String expectedText = "Enter your email" ;
		String actualText = driver.findElement(By.id("Email")).getAttribute("placeholder");
		System.out.println("test case will pass");
		Assert.assertEquals(actualText, expectedText);
		
		driver.close();
		
	}		

}
