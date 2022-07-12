package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import KiteBase.Base;
import KitePOMUsingExcel.KiteHomePage1;
import KitePOMUsingExcel.KiteLoginPage1;
import KitePOMUsingExcel.KitePinPage1;
import KiteUtility.Utility;

public class ValidateKiteUserID extends Base{
	
	KiteHomePage1 home;
	KiteLoginPage1 login;
	KitePinPage1 pin;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		login= new KiteLoginPage1(driver);
		pin= new KitePinPage1(driver);
		home= new KiteHomePage1(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(Utility.readDataFromExcel(4, 0));
		login.sendPassword(Utility.readDataFromExcel(4, 1));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromExcel(4, 2));
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
  @Test
  public void validateUserID() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getActualUserName(), Utility.readDataFromExcel(4, 0));
  }
  @AfterMethod
  public void logOutFromKite() throws InterruptedException
  {
  home.logOut();
  }
  @AfterClass
  public void closeBrowser()
  {
  driver.close();
  }
}
