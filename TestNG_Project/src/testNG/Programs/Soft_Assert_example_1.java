package testNG.Programs;

import org.testng.Assert;

// example for soft assert
//comparison of hard assert and soft assert

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_example_1 
{
  @Test
  public void softAssert() 
  {
	  SoftAssert soft = new SoftAssert();
	  System.out.println("Soft Assert started");
	  soft.assertEquals(12, 13);
	  System.out.println("Executing next steps inspite of assert condition failed");
	  soft.assertAll();
  }
  
  @Test()
  public void hardAssert()
  {
	  System.out.println("Hard Assert started");
	  Assert.assertEquals(12, 13);
	  System.out.println("this step will not be executed");
  }
}
