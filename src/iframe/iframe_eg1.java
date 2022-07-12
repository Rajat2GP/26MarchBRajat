package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_eg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().frame("iframeResult");
	    
	    driver.findElement(By.xpath("//button[@type='button']")).click();
		
	    System.out.println("Hi this is change for git");

	}

}
