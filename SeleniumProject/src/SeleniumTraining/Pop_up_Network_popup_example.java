package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop_up_Network_popup_example 
{

	public static void main(String[] args) 
	{

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://UserName:Password@Example.com");
		
		// to handle network pop-up that is authentication pop-up we need to skip the above url
		//launching url obtained after giving login credentials manually
		driver.navigate().to("http://example.com/");
		
		driver.close();
		
	}

}
