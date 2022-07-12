package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://demoqa.com/select-menu");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    
		    WebElement multiSelectElement = driver.findElement(By.name("cars"));
		    Select s= new Select(multiSelectElement);
		    
		    System.out.println("Multiselect element is "+s.isMultiple());
		    
		    s.selectByVisibleText("Volvo");
		    Thread.sleep(100);
		    s.selectByValue("saab");
		    Thread.sleep(100);
		    s.selectByIndex(2);
		    Thread.sleep(100);
		    s.selectByIndex(3);
		    
		    Thread.sleep(100);
		    //s.deselectAll();
		    
//		    s.deselectByIndex(3);
//		    Thread.sleep(100);
//		    s.deselectByIndex(2);
//		    Thread.sleep(100);
//		    s.deselectByValue("saab");
//		    Thread.sleep(100);
//		    s.deselectByValue("Volvo");
		    
		    System.out.println(s.getFirstSelectedOption().getText());
		    
		    s.getAllSelectedOptions();
		    
		    
		    
		    
		    
		

	}

}
