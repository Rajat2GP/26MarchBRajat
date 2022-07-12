package KiteTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.BaseNew;
import KitePOMUsingTestNG.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;
import KiteUtility.UtilityProp;

public class ValidateKiteUserIDUsingProperty extends BaseNew
{
	
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	
	String TCID= "555";
	
	@BeforeClass
	public void luanchBrowser() throws IOException 
	{
		openBrowser();
	    login= new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException
	{
		login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
		login.sendPassword(UtilityProp.getDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		
		pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		
	}
	
        @Test
        public void validateUserID() throws IOException, InterruptedException 
        {
        	Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
        	Thread.sleep(1000);
        	UtilityProp.captureScreenshot(driver,TCID);
        
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
