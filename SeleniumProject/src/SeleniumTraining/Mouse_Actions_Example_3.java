package SeleniumTraining;
// example on drag and drop
// Goto www.dhtmlgoodies.com and perform drag and drop

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions_Example_3 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));  // identifying source element(from)
		
		WebElement targ = driver.findElement(By.xpath("//h1[text()='Block 4']")); // identifying target element(to)
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, targ).perform();
		
		Thread.sleep(5000);
		
		//Alternate way of doing it is
		
		WebElement srcAgain = driver.findElement(By.xpath("//h1[text()='Block 3']"));  // identifying source element(from)
		
		WebElement targAgain = driver.findElement(By.xpath("//h1[text()='Block 2']")); // identifying target element(to)
		
		act.moveToElement(srcAgain).clickAndHold().moveToElement(targAgain).release().build().perform();
		
		driver.close();
	}

}
