package testNG.Programs;
// go to google and verify if Gmail line is available

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Example_1 
{
	@Test
	public void login()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		boolean actual = driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertEquals(actual, false);
		driver.close();
		
		//By changing false to true gives
//		Assert.assertEquals(actual, true);
//		driver.close();
		
	}

}


