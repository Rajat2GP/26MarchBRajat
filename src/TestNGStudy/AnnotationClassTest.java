package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationClassTest {
  @Test
  public void ValidateUserId() 
  {
	  Reporter.log("Validate user Id",true);
  }
  
  @BeforeMethod
  public void Kiteapplogin() 
  {
	  Reporter.log("LogIn successs",true);
	  
  }
  
  @AfterMethod
  public void Kiteapplogout() 
  {
	  Reporter.log("Logout success",true);
	  
  }
  
  @BeforeClass
  public void LaunchBrowser() 
  {
	  Reporter.log("browser launched", true);
	  
  }
  
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("close browser");
	  
  }
  
}
