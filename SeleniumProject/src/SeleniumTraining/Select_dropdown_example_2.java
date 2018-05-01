package SeleniumTraining;
// Handling options in a single select drop down List
// Write a program to select 
//1:last option from a drop down
//2:last third option from a drop down

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdown_example_2 
{

	public static void main(String[] args) 
	{

		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:/facebook.com");
		
		// identifying drop down box		
		WebElement ddl = driver.findElement(By.id("month"));
		 
		Select sct = new Select(ddl);
		
		List<WebElement> li=sct.getOptions();
		
			// 1: last option would be ListSize-1
			int lastOptionIndex = li.size()-1;
			
			// /identifying/pointing to last option web element in the list
			WebElement lastOptionWebelement = li.get(li.size()-1);
			
			// getting visible text of last option
			String lastOptionText = lastOptionWebelement.getText();
			
			System.out.println(" last option from drop down list has visible text " + lastOptionText);
			
			// 2: for last third option
			 WebElement lastThirdOptionWebelement = li.get((li.size())-3);
			 String lastThirdOption = lastOptionWebelement.getText();
			 System.out.println("last third option from drop down list has visible text " + lastThirdOption);
			 
							
		driver.close();
	}

}
