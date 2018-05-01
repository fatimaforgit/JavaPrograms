package SeleniumTraining;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

// Go to flipkart and identify the below
//search text box
//login
//sign up
//electronics
//gift card


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Locators_Assignment_3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		
		// locate search text boxr
		
		By textBox=By.name("q");
		WebElement textBox1=driver.findElement(textBox);
		textBox1.sendKeys("some");
		
		//locate login icon
		
		By clickLogin=By.partialLinkText("Log In");
		WebElement clickLogin1=driver.findElement(clickLogin);
		clickLogin1.click();
		
		// enter login user name
		
		By userName=By.cssSelector("._39M2dM>input[type='text']");
		WebElement userName1=driver.findElement(userName);
		userName1.sendKeys("disturbanees@yahoo.co.in");
		
		// enter login password
		
		By password=By.cssSelector("._2zrpKA._3v41xv");
		WebElement password1=driver.findElement(password);
		password1.sendKeys("some");
		
		// hit login button
		
		By loginButton=By.cssSelector("._3zLR9i._1LctnI._36SmAs");
		WebElement loginButton1=driver.findElement(loginButton);
		loginButton1.click();
		
		// creating delay
		
		Thread.sleep(4000);
		
		// sending escape key to go back to flipkart home
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ESCAPE).build().perform();		
			
		
		// locate sign up 
		
		By signUp=By.xpath("//a[text()='Signup']");
		WebElement signUp1=driver.findElement(signUp);
		signUp1.click();
		
	// creating delay
		
		Thread.sleep(4000);
		
		// sending escape key to go back to flipkart home
				Actions aa=new Actions(driver);
				aa.sendKeys(Keys.ESCAPE).build().perform();	
				
				
		// locate Electronics				
				
		By electronics=By.xpath("//span[text()='Electronics']");
		WebElement electronics1=driver.findElement(electronics);
		electronics1.click();
		
		// select lenovo from options
		
		//driver.findElement(By.xpath("//ul[contains(@class='QPOmNK required-tracking')]/..//li[@class,'_1KCOnI'")).click();
		
		// locate gift card
		
		By giftCard=By.linkText("Gift Card");
		WebElement giftCard1=driver.findElement(giftCard);
		giftCard1.click();
		
		// move page up
		
		for(int i=0;i<=2;i++)
		{
			Actions ab=new Actions(driver);
			ab.sendKeys(Keys.DOWN).build().perform();	
		}
		
		// tick personalized
		By tik=By.xpath("//label[contains(text(),'your Gift')]");
		WebElement tik1=driver.findElement(tik);
		tik1.click();
		
		//  move page up
		
		for(int i=0;i<=2;i++)
		{
			Actions ac=new Actions(driver);
			ac.sendKeys(Keys.DOWN).build().perform();	
		}
		
		// click on add Gift card
		
		
		By add=By.id("egv-add-voucher");
		WebElement add1=driver.findElement(add);
		add1.click();
		
		Thread.sleep(4000);
		
		driver.quit();
		

	}

}
