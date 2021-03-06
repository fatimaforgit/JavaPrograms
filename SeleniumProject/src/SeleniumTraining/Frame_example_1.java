package SeleniumTraining;
import java.util.Iterator;
// goto zoho.com and perform login using
//id or name to identify frame
//xpath to identify frame
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Frame_example_1 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/");
		
		// click login using mouse actions
		WebElement login = driver.findElement(By.linkText("Login"));
		Actions act = new Actions(driver);
		act.contextClick(login).perform();
		login.sendKeys("W");
		
		//get window ids
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		String firstWindowID = it.next();
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
		
		//closing first/parent window
		driver.switchTo().window(firstWindowID).close();
		
		//same example using frame(WebElement element) where frame is identified using xpath not id or name
		
		/*WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
		WebElement frameIdentified = driver.findElement(By.xpath("//iframe[@src='https://accounts.zoho.com/login?servicename=ZohoHome&hidesignup=true&&hide_secure=true&css=https://www.zoho.com/css/prd-sign.css']"));
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
		*/
	
	}

}
