package SeleniumTraining;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class settingUp_IE_Driver 
{

	public static void main(String[] args) 
	{
		//String path =System.getProperty("user.dir"); // gives current path of project
		//System.out.println(path);
		//System.setProperty("webdriver.ie.driver", path+"\\DriverPath\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Anees\\Downloads\\IE Driver set up files\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://www.gmail.com");

	}

}
