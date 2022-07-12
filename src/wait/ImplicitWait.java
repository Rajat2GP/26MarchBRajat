package wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException 
	{
		
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://vctcpune.com/");
		    driver.manage().window().maximize();
		    
		    //Thread.sleep(3000); //100-->1900
		    //implicit wait
		    
		    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); //500
		    driver.close();
		    
		    
		    
		

	}

}
