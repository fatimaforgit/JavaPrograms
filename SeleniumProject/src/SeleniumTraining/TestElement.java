package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import helpers.GetElements;

public class TestElement 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		WebElement search = GetElements.byID(driver, "lst-ib");
		search.clear();
		search.sendKeys("Selenium", Keys.ENTER);
		
		
	}

}
