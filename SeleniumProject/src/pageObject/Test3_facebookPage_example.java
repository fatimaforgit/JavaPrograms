package pageObject;
// Scenario : goto facebook without enter on username and click on login

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3_facebookPage_example 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		facebookPage_example actn = new facebookPage_example(driver);
			
		WebElement un = actn.getUsername();
		un.sendKeys("something@something.com");
		
		WebElement lb = actn.getLoginButton();
		lb.click();
		
		driver.close();
		

	}

}
