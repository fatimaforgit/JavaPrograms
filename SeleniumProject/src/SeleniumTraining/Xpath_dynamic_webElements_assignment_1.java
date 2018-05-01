package SeleniumTraining;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Xpath_dynamic_webElements_assignment_1 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://flipkart.com");
		
		//choose electronics
		driver.findElement(By.xpath("//a[contains(@title,'Electronics')]")).click();
		
		//choose mobile under electronics
		driver.findElement(By.linkText("Mobiles")).click();
		
		Thread.sleep(4000);
		
		// go to Brands
		driver.findElement(By.linkText("Brand")).click();
		
		//choose samsung checkbox
		driver.findElement(By.linkText("//label[div[text()='SAMSUNG']]/div[@class='_1p7h2j']")).click();
		
		//also choose lonovo checkbox
		driver.findElement(By.xpath("//label[div[text()='Lenovo']]/div[@class='_1p7h2j']")).click();
		
		
	}
}
