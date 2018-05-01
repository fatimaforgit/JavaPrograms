package SeleniumTraining;
//Go to zoho.com and select HR recruit under HR by Mouse hovering

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions_Example_1 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.zoho.com/login.html");
		
		WebElement hr = driver.findElement(By.linkText("HR"));
		Actions act = new Actions(driver);
		act.moveToElement(hr).click(hr).build().perform();
		
		WebElement hrRecruit = driver.findElement(By.xpath("(//a[@href='/recruit/'])[2]"));
		act.moveToElement(hrRecruit).click(hrRecruit).build().perform();
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
