package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

// Scenario : goto yatra.com and select departure date

public class Pop_up_Hidden_division_pop_up_example_2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.yatra.com");
		
		driver.findElement(By.id("BE_flight_depart_date")).click();
	
		
		driver.findElement(By.id("a_2016_9_22")).click();
		
		WebElement ele = driver.findElement(By.id("BE_flight_paxInfoBox"));
		
		Actions act = new Actions(driver);
		act.click(ele).perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Premium Economy')]")).click();
		driver.findElement(By.className("done")).click();

	}

}
