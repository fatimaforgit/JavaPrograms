package SeleniumTraining;

//Go to gmail.com and identify below
//1 email id text box
//2 next button
//3 create account
//4 go to sign up and identify
//first name
//last name
//birthday
//location

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Locators_Assignment_2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
	
			By g1=By.id("Email");    					//sending email id in email id text box
			WebElement gmail1=driver.findElement(g1);
			gmail1.sendKeys("perfume59");
		
			By g2=By.id("next");						// clicking next button
			WebElement gmail2=driver.findElement(g2);
			gmail2.click();
			
//creating delay
			Thread.sleep(5000);
			
			
			
			driver.navigate().back();					// going back to login page
		
			By g3=By.partialLinkText("Create account");	//  clicking create account
			WebElement gmail3=driver.findElement(g3);
			gmail3.click();
		
			By g4=By.id("FirstName"); 					// entering first name
			WebElement gmail4=driver.findElement(g4);
			gmail4.sendKeys("Anees");
			
			By g5=By.id("LastName"); 					// entering last name
			WebElement gmail5=driver.findElement(g5);
			gmail5.sendKeys("Fatima");
		
			By g6=By.cssSelector("#BirthMonth>div[title='Birthday']"); 		// selecting birth month
			WebElement gmail6=driver.findElement(g6);
			gmail6.click();
			
			// select birth month as October
			for(int i = 0; i < 9; i++)
			{
			    Actions actions = new Actions(driver);
			    actions.sendKeys(Keys.DOWN).build().perform();
			}
			
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ENTER).build().perform();
			
			//type date
					
			By g8=By.id("BirthDay"); 					
			WebElement gmail8=driver.findElement(g8);
			gmail8.sendKeys("19");
			
			// type year
			
			By g9=By.id("BirthYear"); 					
			WebElement gmail9=driver.findElement(g9);
			gmail9.sendKeys("1990");
			
			// select country
			
			By g10=By.id(":h"); 					
			WebElement gmail10=driver.findElement(g10);
			gmail10.click();
			
			//select  40th country from the list
			for(int i = 0; i < 40; i++)
			{
			    Actions a1 = new Actions(driver);
			    actions.sendKeys(Keys.DOWN).build().perform();
			}
			
			Actions a1 = new Actions(driver);
			actions.sendKeys(Keys.ENTER).build().perform();
			
			
			driver.close();	 
				
	}

}


	

	