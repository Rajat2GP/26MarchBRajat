package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp 
{
	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException 
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Rajat\\VelocityTesting\\Screenshots"+TCID+".png");
		FileHandler.copy(src, dest);
		
	}
	
	public static String getDataFromPropertyFile(String key) throws IOException 
	{
		Properties prop= new Properties();
		FileInputStream myfile= new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\26March-B_Selenium\\myProperties.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
	}

}
