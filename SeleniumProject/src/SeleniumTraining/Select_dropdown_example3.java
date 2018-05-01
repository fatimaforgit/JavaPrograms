package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

//Handling options in a multi-select drop down List
//Write a program to select 
//3:select a few options then display only first options from selected options
//4:select a few options then display only selected options (all selected options)

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdown_example3 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		//identify and click advanced search option
		driver.findElement(By.linkText("Advanced Search")).click();
		
		// identifying drop down box		
		WebElement ddl = driver.findElement(By.id("ddAdvIndusrty"));
		 
		Select sct = new Select(ddl);
		
		// 3: get first selected option only
		
		sct.selectByIndex(1);
		sct.selectByIndex(2);
		sct.selectByIndex(3);
		
		WebElement firstSelectedOption = sct.getFirstSelectedOption();
		System.out.println("first seleted options is " + firstSelectedOption);
				
	// 4: to select a few options
	
	sct.selectByIndex(2);
	sct.selectByIndex(3);
	sct.selectByIndex(4);
	
	// displaying all selected options only. here 3 are selected
	List<WebElement> selectedOptions = sct.getAllSelectedOptions();
	
	for(int i=0;i<selectedOptions.size();i++)
	{
//		WebElement ele = selectedOptions.get(i);
//		String t = ele.getText();
//		System.out.println("all seleted options are " + t);
		System.out.println(selectedOptions.get(i).getText());
	}
	}

}
