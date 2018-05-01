package testNG_Listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Contains_Listeners implements ITestListener
{
		
  @Override
  public void onStart(ITestContext Result) 
  {
  System.out.println("This class started..............."+Result.getName());
 
  }
  
  @Override
  public void onTestSuccess(ITestResult Result) 
  {
  System.out.println("This class passed..............."+Result.getName());
  System.out.println("This method passed..............."+Result.getMethod());
  System.out.println("This method has priority ..............."+Result.getMethod().getPriority());
 
  }
  
  @Override
  public void onTestFailure(ITestResult Result) 
  {
  System.out.println("This class failed..............."+Result.getName());
 
  }
  
  
  @Override
  public void onTestSkipped(ITestResult Result) 
  {
  System.out.println("This class skipped..............."+Result.getName());
 
  }
  
  
  @Override
  public void onTestStart(ITestResult Result) 
  {
  System.out.println("This class onTestStart..............."+Result.getName());
 
  }
  
  
  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult Result) 
  {
  System.out.println("This class onTestFailedButWithinSuccessPercentage..............."+Result.getName());
 
  }
  
  @Override
  public void onFinish(ITestContext Result) 
  {
  System.out.println("This class finished execution..............."+Result.getName());
 
  }
  
  
  
}
