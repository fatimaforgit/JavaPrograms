package SeleniumTraining;

// 1 program to open google.com, 
// 2 identifying & clicking Gmail, 
// 3 close browser
// 4 open google.com again, 
// 5 identifying & clicking images
// 6 close browser again

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_exercise 
{

	public static void main(String[] args) 
	{
		locator l=new locator();  // creating object for class locator
		l.Identify_Gmail_Element(); // calling method
		l.Identify_Images_Element();  // calling method

	}

}


class locator
{	
	public void Identify_Gmail_Element()   								//method to open Gmail
	{
		FirefoxDriver driver=new FirefoxDriver();  						// opening browser
		driver.get("http://www.google.com");							// opening google.com
		By ref=By.linkText("Gmail");									// passing link text value	
		WebElement forGmail=driver.findElement(By.linkText("Gmail"));	// identifying web element
		forGmail.click();												// clicking "Gmail" link text to open gmail page
		driver.close();   												// closing browser
	}
	
	
	public void Identify_Images_Element()   							//method to open google images
	{ 
		FirefoxDriver driver=new FirefoxDriver();						// opening browser
		driver.get("http://www.google.com");							// opening google.com
		By ref=By.linkText("Images");									// passing link text value
		WebElement forImages=driver.findElement(By.linkText("Images"));	// identifying web element
		forImages.click();												// clicking "Images" link text to open gmail page
		driver.close();													// closing browser
	}
}