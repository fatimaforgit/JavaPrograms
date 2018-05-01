package pageObject;
// Scenario: goto facebook ccount creation page and enter firstname, surname and click on create an account
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1_FacebookAccountCreationPage 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		FacebookAccountCreationPage fbAcnt = new FacebookAccountCreationPage(driver);
		WebElement fn = fbAcnt.firstName();
		fn.sendKeys("My");
		
		WebElement sn = fbAcnt.surname();
		sn.sendKeys("Account");
		
		WebElement create = fbAcnt.createAccountButton();
		create.click();
		
		driver.close();

	}

}
