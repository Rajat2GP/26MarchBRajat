package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2 {
  @Test(groups={"regression"})
  public void p() 
  {
	  Reporter.log("P is running,regression",true);
  }
  
  @Test(groups= {"sanity"})
  public void q()
  {
	  Reporter.log("q is running, sanity",true);
  }
  
  @Test(groups= {"regression"})
  public void r()
  {
	  Reporter.log("r is Running, regression",true);
  }
  
  @Test(groups="sanity")
  public void s()
  {
	  Reporter.log("s is Running, sanity",true);
  }
}
