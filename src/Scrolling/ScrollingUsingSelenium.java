package Scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUsingSelenium {

	public static void main(String[] args) throws InterruptedException
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://vctcpune.com/selenium/practice.html");
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    
		    //implicit wait
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); //too
		    
		    JavascriptExecutor e = (JavascriptExecutor)driver;
		    e.executeScript("window.scrollBy(90,800)");
		
      
	}

}
