package SeleniumTraining;
// goto IRCTC and click on e-catering. 
//get window ID of both parent and child window 
//perform action on child window and close it
//perform action on parent window and close it

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Pop_up_Child_Window_pop_up_example_2 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.linkText("Flight Tickets")).click();
				
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String windowId1 = it.next();
		System.out.println("parent window id "+ windowId1);
		int i=2;
		while(it.hasNext())
			
		{			
			String windowId2 = it.next();
			System.out.println("child window id " + windowId2);
			driver.switchTo().window(windowId2);
			driver.manage().window().maximize();
			driver.switchTo().window(windowId2);
			Thread.sleep(2000);
			i++;
		}
		
		
		driver.findElement(By.xpath("//div[@class='containerfld']/input[@id='origin']")).sendKeys("Bangalore,BLR");
		driver.findElement(By.xpath("//div[@class='containerfld']/input[@id='destination']")).sendKeys("Pune,PNQ");
		Thread.sleep(2000);
		driver.close();
		
		
		driver.switchTo().window(windowId1);
		driver.findElement(By.id("usernameId")).sendKeys("some text");
		driver.close();
	}

}
