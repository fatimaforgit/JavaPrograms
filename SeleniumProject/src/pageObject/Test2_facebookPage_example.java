package pageObject;
// Scenario : goto facebook without entering any credentials click on login

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2_facebookPage_example 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		facebookPage_example actn = new facebookPage_example(driver);
			
		WebElement lb = actn.getLoginButton();
		lb.click();
		
		driver.close();
		

	}

}
