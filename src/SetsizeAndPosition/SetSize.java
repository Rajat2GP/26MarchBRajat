package SetsizeAndPosition;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://www.facebook.com/r.php");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		
		    System.out.println(driver.manage().window().getSize());
		    
		    //to set size, need to create object of Dimension class and pass Width and Height
		    
		     Dimension d = new Dimension(1111,600);
		    //using setSize method we can set size
		    driver.manage().window().setSize(d);

	}

}
