package SeleniumTraining;
//Go to google and right click on Gmail link and select "Open in new window" from there

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions_Example_2 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		WebElement link = driver.findElement(By.linkText("Gmail"));
		Actions act = new Actions(driver);
		act.contextClick(link).sendKeys("w").build().perform();
		
				
		Thread.sleep(3000);
		
		driver.close();

	}

}
