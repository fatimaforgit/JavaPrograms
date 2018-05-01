package SeleniumTraining;

// 1 program to open google.com, 
// 2 identifying & clicking Gmail, 
// 3 navigating back to google.com, 
// 4 identifying & clicking images

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators_example_program 
{
	public static void main(String[] args) 
	{
		locate l=new locate();   // creating object for class locator
		l.IdentifyElement();   	// calling method
	}
}

class locate 
{	
	public void IdentifyElement()
	{		
		FirefoxDriver driver=new FirefoxDriver();   					// opening browser
		driver.get("http://www.google.com");							// opening google.com
		By ref=By.linkText("Gmail");									// passing link text value
		WebElement forGmail=driver.findElement(By.linkText("Gmail"));	// identifying web element
		forGmail.click();												// clicking "Gmail" link text to open gmail page
		
		driver.navigate().back();										//navigating to google.com by clicking back button
		
		By ref1=By.linkText("Images");									// passing link text value
		WebElement forImages=driver.findElement(By.linkText("Images"));	// identifying web element
		forImages.click();												// clicking "Images" link text to open gmail page
		
		driver.close();													// closing browser
	}
}
		
	
	
