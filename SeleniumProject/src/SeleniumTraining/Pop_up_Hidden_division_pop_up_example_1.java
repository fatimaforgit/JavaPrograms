package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Scenario : goto below link and click upload file button, on the pop-up click on sign up

public class Pop_up_Hidden_division_pop_up_example_1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.2shared.com/#");
		
		driver.findElement(By.xpath("//input[@title='Upload file']")).click();
		driver.findElement(By.id("login")).sendKeys("something@something.com");
		driver.findElement(By.id("password")).sendKeys("some", Keys.ENTER);
		
		driver.findElement(By.id("blockModalPopupDiv")).click();

	}

}
