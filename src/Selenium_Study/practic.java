package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practic {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rajat\\VelocityTesting\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.goibibo.com/hotels/");
        driver.findElement(By.xpath("//a[@class='nav-link active']"));
		

	}

}
