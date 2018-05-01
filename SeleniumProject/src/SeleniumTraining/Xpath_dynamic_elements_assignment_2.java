package SeleniumTraining;

// locate male radio button using xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_dynamic_elements_assignment_2 
{

	public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com");
			
			//click male radio button
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//span[label[text()='Male']]/input[@id='u_0_e']")).click();
			
		}
}
