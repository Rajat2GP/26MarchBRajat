package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	     driver.get("https://vctcpune.com/selenium/practice.html");
	     
	   driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Velocity");
	   
	   Thread.sleep(1000);	   
	   
	   driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
	   
		
		
		

	}

}
