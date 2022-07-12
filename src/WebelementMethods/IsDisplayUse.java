package WebelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayUse {

	public static void main(String[] args) throws InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.get("https://vctcpune.com/selenium/practice.html");
		    driver.manage().window().maximize();
		    Thread.sleep(1000);
		    
		   WebElement hide = driver.findElement(By.id("hide-textbox"));
		   WebElement show = driver.findElement(By.id("show-textbox"));
		   WebElement textbox = driver.findElement(By.name("show-hide"));
		   
		   if(textbox.isDisplayed())
		   {
			   System.out.println("Thank you text box is displayed");
		   }
		   else {
			   System.out.println("cant find textbox");
		   }
		    
		   hide.click();
		   
		   if(textbox.isDisplayed())
			   {
			   System.out.println("Thank you text box is displayed");
			}
		    
		   else {
			   System.out.println("cant find textbox");
		   }
		   
		   Thread.sleep(1000);
		   
		   show.click();
		   
		   if(textbox.isDisplayed())
		   {
			   System.out.println("Thank text box is displayed");
		   }
		   
		   else {
			   System.out.println("cant find textbox");
			   
		   }
		

	}

}
