package testNG_Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_Assert_example 
{
  @Test(groups = {"Group_1"})
  public void method_1() 
  {	  
	  String name = "Anees fatima";
	  
	  SoftAssert sa = new SoftAssert();	  
	  sa.assertEquals("Anees fatima", name);
	  sa.assertAll();
	  
  }
  
  @Test(groups = {"Group_2"})
  public void method_3() 
  {	  
	  String name = "Anees fatima";
	  
	  SoftAssert sa = new SoftAssert();	  
	  sa.assertEquals("Anees fatima", name);
	  sa.assertAll();
	  
  }
}
