package testNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_Assert_example 
{
	@Test(groups = {"Group_1"})
	public void method_2() 
	{
		String place = "Bangalore";
		Assert.assertEquals("Bangalore", place);
	}


	@Test(groups = {"Group_2"})
	public void method_4() 
	{
		String place = "Bangalore";
		Assert.assertEquals("Bangalore", place);
	}

}
