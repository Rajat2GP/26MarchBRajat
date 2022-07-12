package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Eg1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://kite.zerodha.com/");
		    
		    Thread.sleep(1000);
		
		    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    
		    File destination=new File("D:\\Rajat\\VelocityTesting\\Screenshots\\myScreenshot1.png");
		    
		    FileHandler.copy(source, destination);

	}

}
