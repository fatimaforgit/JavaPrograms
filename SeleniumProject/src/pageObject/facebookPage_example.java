package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.GetElements;

// Step 1
public class facebookPage_example
{ // Step 2

// Step 3
	WebDriver driver;	
	public facebookPage_example(WebDriver driver)
	{
		this.driver=driver;
	}
	
// Step 4
	public WebElement getUsername()
	{
		WebElement ele = GetElements.byID(driver, "email");
		return ele;
	}
// Step 4	
	public WebElement getPassword()
	{
		WebElement ele = GetElements.byID(driver, "pass");
		return ele;
	}
// Step 4
	public WebElement getLoginButton()
	{
		WebElement ele = GetElements.byID(driver, "loginbutton");
		return ele;
	}
	
}
