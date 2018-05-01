package SeleniumTraining;
// launch popuptest.com and close all windows except parent window and child window having particular background color
import java.util.Iterator;

//Launch popuptest.com
//Click 'Multi-PopUp Test #2 '
//Print the number of windows opened
//Close all the windows but not the parent window and the child window which has background color "#00C957"
//Print the page URL and Title and the closed windows
//Take the snapshot of the windows which are open.

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pop_up_Child_Window_pop_up_example_4 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://popuptest.com/popuptest12.html");
		
		Set<String> windowIDs = driver.getWindowHandles();
		Thread.sleep(2000);
		
		System.out.println("number of windows opened --> "+ windowIDs.size());
		
		Iterator<String> it = windowIDs.iterator();
		String parent  = it.next();

		// child pop 1
		String child  = it.next();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
	
		WebElement attri = driver.findElement(By.xpath("//body[@bgcolor='#3D59AB']"));
		String bgOfChild = attri.getAttribute("bgcolor");
		System.out.println(bgOfChild);
		if(!bgOfChild.equals("#FF6633"))
		{
			driver.close();
		}
		
		// child pop 2
		String child2  = it.next();
		driver.switchTo().window(child2);
		driver.manage().window().maximize();
		
		WebElement attri2 = driver.findElement(By.xpath("//body[@bgcolor='#FF6633']"));
		String bgOfChild2 = attri2.getAttribute("bgcolor");
		System.out.println(bgOfChild2);
		if(!bgOfChild2.equals("#FF6633"))
		{
			driver.close();
		}
		
		// child pop 3
		String child3  = it.next();
		driver.switchTo().window(child3);
		driver.manage().window().maximize();
		
		WebElement attri3 = driver.findElement(By.xpath("//body[@bgcolor='#00C957']"));
		String bgOfChild3 = attri3.getAttribute("bgcolor");
		System.out.println(bgOfChild3);
		if(!bgOfChild3.equals("#FF6633"))
		{
			driver.close();
		}
		
	}

}
