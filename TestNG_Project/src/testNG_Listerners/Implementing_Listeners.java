package testNG_Listerners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNG_Listerners.Contains_Listeners.class)

public class Implementing_Listeners
{
		
//purposely passing this test to check listeners
	@Test
	public void method_2() 
	{
		String place = "Bangalore";
		Assert.assertEquals("Bangalore", place);
	}

//purposely failing this test to check listeners
	@Test
	public void method_4() 
	{
		String place = "Banga";
		Assert.assertEquals("Bangalore", place);
	}
}
