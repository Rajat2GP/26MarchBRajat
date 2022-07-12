package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumCode {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rajat\\VelocityTesting\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spotify.com/in-en/");
		
		

	}

}
