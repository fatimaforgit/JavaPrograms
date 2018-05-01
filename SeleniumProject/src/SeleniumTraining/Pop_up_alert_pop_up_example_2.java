package SeleniumTraining;
// goto http://www.javascriptkit.com/javatutors/alert2.shtml and click on alert button. Handle the alert pop-up
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop_up_alert_pop_up_example_2
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		
		driver.findElement(By.name("B2")).click();  // an alert should pop-up
		
		// switching control from web page to alert
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		// reading message from the alert pop-up
		String message = alt.getText();
		System.out.println("message on alert pop-up is \n" + message);
		
		// performing action on this alert pop-up
		alt.accept();
		
		
	}

}
