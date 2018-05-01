package SeleniumTraining;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ImplicitWait_Example 
{

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http:/www.flipkart.com");
		
		//open mobile under Electronics
		driver.findElement(By.cssSelector("a[title='Electronics']>span[is='null']")).click();
		driver.findElement(By.linkText("Samsung")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
