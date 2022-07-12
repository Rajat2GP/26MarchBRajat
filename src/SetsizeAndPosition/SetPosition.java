package SetsizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://www.facebook.com/r.php");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    
		    System.out.println(driver.manage().window().getPosition());
		    //to set position we need to create object of Point Class and pass X and Y coordinate
		    
		    Point p= new Point(200,30);
		    // using SetPosition method we can set the browser position
		    
		    driver.manage().window().setPosition(p);
		

	}

}
