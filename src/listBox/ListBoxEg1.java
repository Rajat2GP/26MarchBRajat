package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEg1 {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://vctcpune.com/selenium/practice.html");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    
		  //1.Identify list box to be handled and store it in reference variable
		    
		    WebElement listBox = driver.findElement(By.name("dropdown-class-example"));
		    
		  //2. Create an object of Select class which will accept WebElement as argument
		    
		    Select s= new Select(listBox);
		    
		    System.out.println("status is"+ s.isMultiple());
		  //3.By using one of the select class methods we can select values from list box like  
		     
		    s.selectByVisibleText("Option1");
		    
     	    Thread.sleep(1000);
		    s.selectByValue("option2");
		    
		    Thread.sleep(1000);
		    s.selectByIndex(3);
	    
//		    s.deselectAll();
//		    
//		    
//		    Thread.sleep(1000);
//		    s.deselectByIndex(3);
//		    
//		    Thread.sleep(1000);
//		    s.deselectByValue("option2");
//		    
//		    Thread.sleep(1000);
//		    s.deselectByVisibleText("Option1");
//		    

	}

}
