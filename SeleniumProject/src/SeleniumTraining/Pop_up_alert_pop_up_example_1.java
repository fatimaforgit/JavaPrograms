package SeleniumTraining;
// goto IRCTC login. Without entering any credentials click on login button. Handle the pop-up thus appear 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop_up_alert_pop_up_example_1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.irctc.com/Emp_Login.jsp");
		
		driver.findElement(By.className("go")).click();  // an alert should pop-up
		
		// switching control from web page to alert
		Alert alt = driver.switchTo().alert();
		
		// performing action on this alert pop-up
		alt.accept();
		
		WebElement username = driver.findElement(By.className("loginbox"));
		username.clear();
		username.sendKeys("something");
		
		

	}

}
