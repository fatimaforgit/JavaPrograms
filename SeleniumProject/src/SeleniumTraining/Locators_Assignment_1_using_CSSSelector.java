package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// Go to facebook and identify below
// 1 email text box
// 2 password text box
// 3 login button
// 4 forgotten account

import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_Assignment_1_using_CSSSelector 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
	
			By b1=By.cssSelector("#email");
			WebElement fb1=driver.findElement(b1);
			fb1.sendKeys("perfume59@gmail.com");
		
			By b2=By.cssSelector("#pass");
			WebElement fb2=driver.findElement(b2);
			fb2.sendKeys("somepassword");
		
			By b3=By.cssSelector("#u_0_m");
			WebElement fb3=driver.findElement(b3);
			fb3.click();
		
			By b4=By.partialLinkText("Forgotten account?"); // using CSS selector is not feasible in this case
			WebElement fb4=driver.findElement(b4);
			fb4.click();
			
			driver.close();
				
	}

}


	

	