package testNG.Programs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest 
{
	WebDriver driver;
	String firstWindowID;

//precondition
	
	@BeforeMethod
	public void launch() 
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/");
	}
	
//post condition

	@AfterMethod
	public void closingBrowser() 
	{
		try
		{
			driver.switchTo().window(firstWindowID).close();
		}
		catch(Exception e)
		{
		}
	}

//actual test
	
	@Test
	public void newMethod() throws InterruptedException
	{		
			// click login using mouse actions
		
			WebElement login = driver.findElement(By.linkText("Login"));
			Actions act = new Actions(driver);
			act.contextClick(login).perform();
			login.sendKeys("W");

			//get window ids
			Set<String> windowIDs = driver.getWindowHandles();

			Iterator<String> it = windowIDs.iterator();
			firstWindowID = it.next();
			String secondWindowID = it.next();

			//switching control to new/second window
			driver.switchTo().window(secondWindowID);

			//switching control from top window to frame within second window
			driver.switchTo().frame("zohoiam");

			//performing action on web elements within frame
			driver.findElement(By.id("lid")).sendKeys("Something@something.com");
			driver.findElement(By.id("pwd")).sendKeys("Something");
			WebElement tickBox = driver.findElement(By.id("rem"));

			if(tickBox.isSelected())
			{
				tickBox.click();
			}

			Thread.sleep(2000);
			driver.findElement(By.id("submit_but")).click();
			Thread.sleep(2000);

			//closing second window
			driver.close();
		
	}

}


