package KitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Rajat\\VelocityTesting\\Excel26MarchB.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		String UN = mySheet.getRow(4).getCell(0).getStringCellValue();
	    String PWD = mySheet.getRow(4).getCell(1).getStringCellValue();
	    String PIN = mySheet.getRow(4).getCell(2).getStringCellValue();
	    
		System.setProperty("webdriver.chrome.driver", "D:\\Rajat\\VelocityTesting\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://kite.zerodha.com/");
		    driver.manage().window().maximize();
		    
		    Thread.sleep(2000);
		    
		    KiteLoginPage1 login= new KiteLoginPage1(driver);
		    login.sendUserName(UN);
		    login.sendPassword(PWD);
		    login.clickOnLoginButton();
		    
		    Thread.sleep(2000);
		    
		    KitePinPage1 pin = new KitePinPage1(driver);
		    pin.sendPin(PIN);
		    pin.clickOnContinueButton();
		    
		    Thread.sleep(3000);
		    KiteHomePage1 home = new KiteHomePage1(driver);
		    home.validateUserName(UN);
		    home.logOut();
		    
		    Thread.sleep(2000);
		    
		    driver.close();
		

	}

}
