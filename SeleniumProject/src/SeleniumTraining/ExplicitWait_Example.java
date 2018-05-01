package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Keys;


public class ExplicitWait_Example 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http:/www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Java", Keys.ENTER);
		driver.findElement(By.partialLinkText("Download Free Java Software")).click();
		WebDriverWait wait=new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Download Free Java Software"));
		System.out.println("Title of new page is \n" + driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("look for");
		
	}

}
