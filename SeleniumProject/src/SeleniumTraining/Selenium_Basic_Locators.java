package SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Basic_Locators 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http:/www.google.com"); // to launch any URL
		driver.navigate().to("http:/www.gmail.com");// to navigate to different web page say gmail.com
		//Thread.sleep(5000); // this is always used just before refresh. Here 5000 is 5 seconds
		driver.navigate().refresh(); // to refresh page	
		
		driver.navigate().back(); // to click back button. This button appears only after navigation 1 and navigation 2
		driver.navigate().forward(); // to click forward button. Pre-condition is back button should be clicked atleast once
		driver.manage().window().maximize(); // to maximize a browser window
		// we can not minimize a browser window in selenium
		String currentUrl = driver.getCurrentUrl(); // to get current URL. It returns a string hence assign it to a string variable
		System.out.println("current URL of web page is " + currentUrl); // prints current URL obtained using getCurrentUrl()  
		
		String title= driver.getTitle(); // to get title of a window. Since it returns a string we will have to assign a string variable
		System.out.println("The title of web page is " + title); // prints title obtained using getTitle() ex: Facebook - Log In or Sign up
		
		driver.close(); // to close any browser
		// driver.quit(); is an alternate method to close any browser. This one kills the browser that is force close of any browser
		

	}

}
