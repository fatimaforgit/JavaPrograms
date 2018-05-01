package SeleniumTraining;
// handling multiple windows that open when naukri.com is launched


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

import helpers.GetElements;

public class Pop_ups_multipleWindows_example 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com");
		
		Thread.sleep(5000);
		
		driver.switchTo().parentFrame();
		
		WebElement login = GetElements.byClass(driver, "login_Layer");
		login.click();
		
		WebElement email = GetElements.byID(driver, "eLogin");
		email.clear();
		email.sendKeys("Something@something.com");
		
		WebElement pass = GetElements.byID(driver, "pLogin");
		pass.clear();
		pass.sendKeys("Something");
		
		GetElements.byLinkText(driver, "Login").click();
		
		
		Thread.sleep(3000);
		
		driver.close();
	}


}
