package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class findElements_mouseActions_example 
{

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Mobile");
		
		List<WebElement> mobileOptions= driver.findElements(By.xpath("//a[@class='_2XvRSN']"));
		 
		System.out.println(" There are " + mobileOptions.size() + " options");
		
		for(int i=0;i<mobileOptions.size();i++)
		{
			
			System.out.println(mobileOptions.get(i).getText());
		}
		
		try
		{
			WebElement firstOption = driver.findElement(By.linkText("mobile intex"));
			Actions act=new Actions(driver);
			act.moveToElement(firstOption).click(firstOption).perform();
			firstOption.click();
			
		}
		catch(ElementNotVisibleException e)
		{
			System.out.println(e);
		}
		
		
		driver.close();
	}
	
}	