package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

// Write a program to display all available options in a drop down

public class Select_dropdown_example_1 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:/facebook.com");
		
		List<WebElement> ddl = driver.findElements(By.id("month"));
				
		for(int i=0;i<ddl.size();i++)
		{
			System.out.println(ddl.get(i).getText());
		}
		
		driver.close();

	}

}
