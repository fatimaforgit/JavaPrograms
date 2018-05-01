package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementReferenceException_Example 
{

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
				
		//to locating search box and search India
		driver.findElement(By.id("lst-ib")).sendKeys("china", Keys.ENTER);
		
		//to locating main links
		List<WebElement> links = driver.findElements(By.xpath("//h3/a"));
		
		//printing number of links found
		System.out.println("Number of links found are " +links.size());
	
		Thread.sleep(10000);
		
		// executing list of links one by one
		for(int i=0;i<(links.size());i++) 	
		{
			
			//click main link
			links.get(i).click();
			
			//wait till web site loads
			WebDriverWait wait=new WebDriverWait(driver, 200);		
			wait.until(ExpectedConditions.urlContains("hina"));
			
			Thread.sleep(2000);
			
			//printing current web site URL
			int m=i+1;
			System.out.println(m+" web page's title is "+driver.getTitle());
			
			Thread.sleep(3000);
			driver.navigate().back();
			
																				
			//wait till google page loads
			WebDriverWait waitForGooglePage=new WebDriverWait(driver, 200);	
			waitForGooglePage.until(ExpectedConditions.urlContains("hina"));
							
			// solution to overcome StaleElement reference exception
			links = driver.findElements(By.xpath("//h3/a"));
			
		}	
		
		driver.close();
				
	}
	
}
	
	