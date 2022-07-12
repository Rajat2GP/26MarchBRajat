package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("alertButton")).click();
	    //1. To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
	    
	    Alert alt= driver.switchTo().alert();
	    
	    Thread.sleep(1000);
	    
	    //2. Alert is an interface which contains abstract methods like:
	    //     1.accept():use to click on ok button.
	    //     2.dismiss(): use to click on cancel button.
	    //     3.getText(): use to get text present in a alert popup.
	    
	    System.out.println(alt.getText());
	    
	    alt.accept();
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();
	    Alert al= driver.switchTo().alert();
	    Thread.sleep(2000);
	    System.out.println(al.getText());
	    al.accept();
	    
	    driver.findElement(By.id("confirmButton")).click();
	    Alert altr= driver.switchTo().alert();
	    System.out.println(altr.getText());
	    altr.accept();
	    
	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	    Alert a= driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.dismiss();
		

	}

}
