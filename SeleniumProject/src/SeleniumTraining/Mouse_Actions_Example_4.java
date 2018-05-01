package SeleniumTraining;
// example on scroll


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class Mouse_Actions_Example_4 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=GFrSV-aqHueK8QeWlbGgDg&gws_rd=ssl#q=java");
		
	WebElement link = driver.findElement(By.partialLinkText("Java - DZone"));
	Coordinates locate = ((Locatable)link).getCoordinates();  //gets the x y co ordinates of web element
	locate.inViewPort();	//scrolls the page where this web element is located
		
		
		
	}

}
