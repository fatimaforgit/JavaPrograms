package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rough {

	public static void main(String[] args) throws InterruptedException
	{
		//Element is not a frame element 
		//org.openqa.selenium.NoSuchFrameException
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
		WebElement frameIdentified = driver.findElement(By.xpath("//iframe[@id='zohoiam']"));
		driver.switchTo().frame(frameIdentified);
		
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
		
		driver.close();
	}

}
