package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://vctcpune.com/");
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    
		    WebElement Ref= driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		    
		    JavascriptExecutor js=((JavascriptExecutor)driver);
		    Thread.sleep(2000);
		    js.executeScript("arguments[0].scrollIntoView(true);",Ref);
		    
		

	}

}
