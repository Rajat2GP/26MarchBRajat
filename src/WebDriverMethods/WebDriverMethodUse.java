package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodUse {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
//		// Method 1:
		driver.get("https://www.youtube.com/");
//		
//		// Method 2:
//		driver.close(); //to close the all the tabs present in browser opened by Selenium tool.
//		
//		// Method 3:
//		//driver.quit(); to close all the tabs present in the browser opened by Selenium tool.
//		
//		// Method 4:
//		driver.manage().window().maximize(); // used to maximize/ minimize the window
//		
//		// Method 5:
//		driver.manage().window().minimize();
		
		// Method 6:
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		
		// Method 7:
	    //System.out.println(driver.getTitle());
	    
	    //String title = driver.getTitle();
	    
	    //System.out.println(title);
		
		// Method 8:
	    // getCurrentURL: this method is use to get URL of a webpage. return type of geCurrentURL method is String
	    
	    //System.out.println(driver.getCurrentUrl());
	   
	    String url= driver.getCurrentUrl();
	    System.out.println(url);
		
				
		

	}

}
