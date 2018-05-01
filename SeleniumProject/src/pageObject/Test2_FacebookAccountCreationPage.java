package pageObject;
// Scenario: goto facebook account creation page and select only birthday and click on create an account
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2_FacebookAccountCreationPage 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
		FacebookAccountCreationPage fbAcnt = new FacebookAccountCreationPage(driver);
		
		WebElement birthday = fbAcnt.day();		
		Select sct = new Select(birthday);
		sct.selectByValue("3");
		
		WebElement create = fbAcnt.createAccountButton();
		create.click();
		
		driver.close();

	}

}
