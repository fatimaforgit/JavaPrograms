package SeleniumTraining;
// program to select 1983 from year list, display entire year list, check if given year exist in the year list
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdownList_Example4 
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to be checked");
		String checkYear = scan.nextLine();
		System.out.println("You entered " + checkYear);
		
		Thread.sleep(3000);
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create?specId=yidReg&lang=en-US&src=ym&done=https%3A%2F%2Fmail.yahoo.com&display=login&intl=us");
		
		WebElement ddl = driver.findElement(By.id("usernamereg-year"));
		Select sct = new Select(ddl);
		sct.selectByVisibleText("1983");
		
		List<WebElement> yearList = sct.getOptions();
		System.out.println("There are "+ yearList.size() + " options under 'year'");
		
		for(int i=0;i<yearList.size();i++)
		{
			System.out.println(yearList.get(i).getText());
		}
		for(int i=0;i<yearList.size();i++)
		{
			String opt = yearList.get(i).getText();
			
			if(opt.equals(checkYear))
					{
				System.out.println(checkYear + " exists in the year list");
					}
		}
		
		driver.close();
		

	}

}
