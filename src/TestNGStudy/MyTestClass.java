package TestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestClass {
	
	@Test
	public void myMethod() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://www.facebook.com/r.php");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    
	}
	@Test
	public void myMethod1() throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://kite.zerodha.com/");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		
	}

}
