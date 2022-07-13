package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDOB {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://www.facebook.com/r.php");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    
		    //1. Identify the list box
		    WebElement date = driver.findElement(By.id("day"));
		    WebElement month = driver.findElement(By.id("month"));
		    WebElement year = driver.findElement(By.id("year"));
		    
		    Thread.sleep(1000);
		    //2.Create object of select class
		    Select s= new Select(date);
		    Select s1= new Select(month);
		    Select s2= new Select(year);
		  
		    //3. By using one of the select class method select the values of list box
		    
		    Thread.sleep(1000);
		    s.selectByIndex(20);
		    s1.selectByValue("2");
		    s2.selectByVisibleText("1996");
		    
		    //Hi this is change for github
		    
		
		

	}

}
