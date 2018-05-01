package SeleniumTraining;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeys_example_program 
{
	public static void main(String[] args) 
	{
		type t1=new type();
		t1.typing();
	}
	
}

class type
{
	public void typing()
	{
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");							// opening google.com
		By ref=By.id("lst-ib");									// passing link text value	
		WebElement t=driver.findElement(ref);	// identifying web element
		t.sendKeys("Selenium");	
		
		By r1=By.className("lsb");
		WebElement t2=driver.findElement(r1);
		t2.click();
		
		By r2=By.linkText("Videos");									// passing link text value	
		WebElement t3=driver.findElement(By.linkText("Videos"));
		t3.click();
		
		By r3=By.linkText("Selenium 2.0 Training");
		WebElement t4=driver.findElement(r3);
		t4.click();
				
		
		//driver.close(); 
	}
	
	
	
}