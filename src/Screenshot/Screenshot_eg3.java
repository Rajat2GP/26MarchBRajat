package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_eg3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.myntra.com/");
	    
	    Thread.sleep(1000);
	    
	    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    String str = RandomString.make(2);
	    File destination = new File("D:\\Rajat\\VelocityTesting\\Screenshots\\TestScreenshot"+str+".png");
	    
	    FileHandler.copy(source, destination);
		
		

	}

}
