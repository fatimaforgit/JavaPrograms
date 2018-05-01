package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.junit.*;

public class CSS_selector_example 
{

	public static void main(String[] args) 
	{
		searchElectronicsItem s=new searchElectronicsItem();
		s.searchIronBox();
	}

}

class searchElectronicsItem
{
	public void searchIronBox() 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		By r1 = By.id("Email");
		WebElement e1=driver.findElement(r1);
		e1.sendKeys("Electronics");
		
		
		
		By r2 = By.id("Next");
		WebElement e2=driver.findElement(r2);
		e2.click();
		
		

		//driver.close();
		
	}
}

