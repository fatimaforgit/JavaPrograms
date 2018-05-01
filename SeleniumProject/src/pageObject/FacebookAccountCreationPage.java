package pageObject;
// scenario: create Page Object Model for facebook account creation page
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.GetElements;

public class FacebookAccountCreationPage 
{
	WebDriver driver;
	public FacebookAccountCreationPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement firstName()
	{
		WebElement ele = GetElements.byID(driver, "u_0_1");
		return ele;
	}
	
	public WebElement surname()
	{
		WebElement ele = GetElements.byID(driver, "u_0_3");
		return ele;
	}
	
	public WebElement mobileNumber()
	{
		WebElement ele = GetElements.byID(driver, "u_0_5");
		return ele;
	}
	
	public WebElement re_mobileNumber()
	{
		WebElement ele = GetElements.byID(driver, "u_0_8");
		return ele;
	}
	
	public WebElement newPassword()
	{
		WebElement ele = GetElements.byID(driver, "u_0_a");
		return ele;
	}
	
	public WebElement day()
	{
		WebElement ele = GetElements.byID(driver, "day");
		return ele;
	}
	
	public WebElement month()
	{
		WebElement ele = GetElements.byID(driver, "month");
		return ele;
	}
	
	public WebElement year()
	{
		WebElement ele = GetElements.byID(driver, "year");
		return ele;
	}
	
	public WebElement female()
	{
		WebElement ele = GetElements.byID(driver, "u_0_d");
		return ele;
	}
	
	public WebElement male()
	{
		WebElement ele = GetElements.byID(driver, "u_0_e");
		return ele;
	}
	
	public WebElement createAccountButton()
	{
		WebElement ele = GetElements.byID(driver, "u_0_i");
		return ele;
	}
	

}
