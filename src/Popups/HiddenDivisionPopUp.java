package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Oneplus 10r");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
