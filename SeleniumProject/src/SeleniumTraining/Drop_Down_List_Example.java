package SeleniumTraining;

import java.util.concurrent.TimeUnit;
// program to select date of birth in facebook account creation

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_List_Example 
{

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		// Step 1: import org.openqa.selenium.support.ui.Select;
		
		// Step 2: Locate dropdown list on the webpage
		WebElement dropDown=driver.findElement(By.id("day"));		
		
		// Step 3: create object for select class and pass the object reference as argument for select constructor
		Select sct=new Select(dropDown);
		
		// Step 4: check if dropdown is multi selector or single selector
		
		boolean checkList=sct.isMultiple(); // this will return true or false
			if(checkList==true)
			{
				System.out.println("This drop down list is multi selector hence deselection is possible");
			}
			else
			{
				System.out.println("This drop down list is single selector hence deselection is not possible");
			}
			
		// Step 5: choose what type of Select is to be used
			sct.selectByVisibleText("12");
			
			Thread.sleep(3000);
			
			driver.close();

	}

}
