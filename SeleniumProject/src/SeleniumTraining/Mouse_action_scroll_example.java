package SeleniumTraining;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class Mouse_action_scroll_example 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		
		
		// locate gift card
		
		By giftCard=By.linkText("Gift Card");
		WebElement giftCard1=driver.findElement(giftCard);
		giftCard1.click();
		
		WebElement personalizeGiftCard  = driver.findElement(By.id("egv-add-voucher"));
		Coordinates locate = ((Locatable)personalizeGiftCard).getCoordinates();
		locate.inViewPort();
	
		Thread.sleep(3000);
	
		personalizeGiftCard.click();
				
		driver.findElement(By.xpath("//label[contains(text(),'your Gift')]")).click();
		
	
		Thread.sleep(4000);
		
	
		

	}

}
