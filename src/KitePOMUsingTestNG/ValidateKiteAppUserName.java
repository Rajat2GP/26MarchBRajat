package KitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateKiteAppUserName {
	WebDriver driver;
	Sheet mySheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	
  @BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Rajat\\VelocityTesting\\chromedriver.exe");
		
	  ChromeOptions opt= new ChromeOptions();
	 // opt.addArguments("headless");
	  opt.addArguments("disaable-notifications");
	  opt.addArguments("incognito");
	  driver= new ChromeDriver(opt);
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
	  
	  Reporter.log("Launching Browser",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  File myfile = new File("D:\\Rajat\\VelocityTesting\\Excel26MarchB.xlsx");
	  mySheet= WorkbookFactory.create(myfile).getSheet("Sheet2");
	  
	  login= new KiteLoginPage(driver);
	  pin = new KitePinPage(driver);
	  home = new KiteHomePage(driver);
	   
  }
  
      @BeforeMethod
      public void loginKiteApp()
      {
    	  String UN  = mySheet.getRow(4).getCell(0).getStringCellValue();
  	      String PWD = mySheet.getRow(4).getCell(1).getStringCellValue();
  	      String PIN = mySheet.getRow(4).getCell(2).getStringCellValue();
  	      
  	      login.sendUserName(UN);
  	      Reporter.log("sending username",true);
  	      login.sendPassword(PWD);
  	      Reporter.log("sending password",true);
  	      login.clickOnLoginButton();
  	      Reporter.log("clicking on continue button", true);
  	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
  	      
  	      pin.sendPin(PIN);
  	      Reporter.log("sending PIN", true);
  	      pin.clickOnContinueButton();
  	      Reporter.log("clicking on continue button",true);
  	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      }
	
      @Test
       public void validateUserName() 
      {
	    String expectedUN = mySheet.getRow(4).getCell(0).getStringCellValue();
	    String actualUN = home.getActualUserName();
	    Reporter.log("Validating UserName",true);
	    Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC failed");
	    Reporter.log("Actual and Expected UN are matching TC PASSED",true);
	    
      }
      
      @AfterMethod
      public void logoutFromKiteApp() throws InterruptedException
      {
    	  home.logOut();
    	  Reporter.log("loggin out..",true);
      }
      
      @AfterClass
      public void closeBrowser() throws InterruptedException
      {
    	  Thread.sleep(2000);
    	  Reporter.log("Clossing browser",true);
    	  driver.close();
      }
      
      
      
      
}
