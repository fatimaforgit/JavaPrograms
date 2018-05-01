package SeleniumTraining;
// goto IRCTC and click on e-catering. 
//get window ID of both parent and child window 
//perform action on child window
//perform action on parent window and close it
//perform action on child window again and close it



import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop_up_Child_Window_pop_up_example_3 
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
		
		//get parent window ID and move pointer to child window
		String windowId1 = it.next();
		System.out.println("parent window id "+ windowId1);
				
		//get child window ID and move pointer to next window which is not present here
		String windowId2 = it.next();
		System.out.println("child window id " + windowId2);
		
		// switch to child window and perform action and do not close the window
		driver.switchTo().window(windowId2);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='containerfld']/input[@id='origin']")).sendKeys("Bangalore,BLR");
		driver.findElement(By.xpath("//div[@class='containerfld']/input[@id='destination']")).sendKeys("Pune,PNQ");
		Thread.sleep(2000);		
		
		// switch to parent window and perform action and close
		driver.switchTo().window(windowId1);
		driver.findElement(By.id("usernameId")).sendKeys("some text");
		driver.close();
	
		// switch to child window again and perform action and close
		driver.switchTo().window(windowId2);
		driver.findElement(By.id("international")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
