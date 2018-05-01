package SeleniumTraining;
// goto http://www.javascriptkit.com/javatutors/alert2.shtml and click on confirmation button. Handle the confirmation pop-up and its resulting pop-ups
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop_up_prompt_pop_up_example_1
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		
		 // scenario 1: click Ok and follow the resulting pop-up		
		driver.findElement(By.name("B4")).click();  // an alert should pop-up
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		String message1 = alt.getText();
		System.out.println("message on confirm pop-up is \n" + message1);
		alt.sendKeys("Some Name");
		alt.accept();
		Thread.sleep(2000);
		String messageOK = alt.getText();
		System.out.println("message displayed after clicking OK button is \n" + messageOK);
		alt.accept();
		
		 // scenario 2: click cancel and follow the resulting pop-up
		driver.findElement(By.name("B4")).click();
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(2000);		
		String message2 = alt2.getText();
		System.out.println("message on confirm pop-up is \n" + message2);
		alt.sendKeys("Some other Name");
		alt.dismiss();
		Thread.sleep(2000);
		String messageCancel = alt.getText();
		System.out.println("message displayed after clicking OK button is \n" + messageCancel);
		alt.accept();
		
		driver.close();
		
	}

}
