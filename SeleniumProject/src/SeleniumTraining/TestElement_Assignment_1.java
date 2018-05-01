package SeleniumTraining;
// Go to facebook.com, identify email and password and perform login

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import helpers.GetElements;

public class TestElement_Assignment_1
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		WebElement email = GetElements.byID(driver, "email");
		email.clear();
		email.sendKeys("Something@something.com");
		
		WebElement pass = GetElements.byID(driver, "pass");
		pass.clear();
		pass.sendKeys("Something");
		
		GetElements.byID(driver, "u_0_l").click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
