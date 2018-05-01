package SeleniumTraining;
// goto zoho.com and perform login 
//click on 'Books' under 'Finance' web element available on top window

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_switchingBack_to_topwindow_example
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/");
		
		driver.findElement(By.linkText("Login")).click();
		
		//identifying frame
		WebElement frameIdentified = driver.findElement(By.xpath("//iframe[@src='https://accounts.zoho.com/login?servicename=ZohoHome&hidesignup=true&&hide_secure=true&css=https://www.zoho.com/css/prd-sign.css']"));
		
		//switching control to frame
		driver.switchTo().frame(frameIdentified);
		
		//performing action on frame elements
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
		
		//switching back to top window to perform action on top window element
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//click on Books under Finance
		WebElement finance = driver.findElement(By.xpath("//a[text()='Finance']"));
		
		Actions act1= new Actions(driver);
		act1.moveToElement(finance).click().build().perform();
		
		Thread.sleep(2000);
		
		WebElement Books = driver.findElement(By.xpath("(//span[@class='app-icon14'])[1]"));
		
		Thread.sleep(2000);
		Actions act2= new Actions(driver);
		act2.moveToElement(Books).click().perform();
	
	}

}
