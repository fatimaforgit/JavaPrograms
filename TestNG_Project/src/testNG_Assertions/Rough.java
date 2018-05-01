package testNG_Assertions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rough 
{
	public static void main(String arg[])
	{
//		String path = System.getProperty("user.dir");
//		System.out.println(path);
//		System.setProperty("webdriver.ie.driver", path+"\\BrowserExeFiles\\IEDriverServer.exe");
//		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		
		WebElement searchBox = driver.findElement(By.id("lst-ib"));
		System.out.println("Before" + searchBox.getAttribute("value"));
		searchBox.sendKeys("Java");
		System.out.println("After" + searchBox.getAttribute("value"));
		
		driver.close();
	}

}

