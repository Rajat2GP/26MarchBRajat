package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUse {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.get("https://en-gb.facebook.com/reg/");
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		

	}

}
