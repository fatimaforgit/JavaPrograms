package SeleniumTraining;

import org.openqa.selenium.chrome.ChromeDriver;

public class settingUp_Chrome_Driver 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anees\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com");

	}

}
