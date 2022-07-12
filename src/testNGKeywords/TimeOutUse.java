package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test(timeOut=3000)
  public void d() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  
	  Reporter.log("d is running",true);
  }
  
  @Test 
  public void a()
  {
	  Reporter.log("a is running",true);
  }
  
  @Test 
  public void b()
  {
	  Reporter.log("b is running",true);
  }
}
