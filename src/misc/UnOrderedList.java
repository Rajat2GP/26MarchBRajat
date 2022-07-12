package misc;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnOrderedList {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		
	    driver.findElement(By.name("q")).sendKeys("honda");
	    Thread.sleep(2000);
	    
	    List<WebElement> searchResults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	    
	    System.out.println(searchResults.size());
	    
	    for(WebElement r:searchResults) 
	    {
	    	System.out.println(r.getText());
	    }
	    
	    for(WebElement result:searchResults) 
	    {
	    	String actualText = result.getText();
	    	String expectedText = "honda city";
	    	
	    	Thread.sleep(1000);
	    	
	    	if(actualText.equals(expectedText)) 
	    	{
	    		result.click();
	    		break;
	    	}
	    	
	    	Thread.sleep(1000);
	    	
	    }
	    driver.findElement(By.linkText("Images")).click();

	}

}
