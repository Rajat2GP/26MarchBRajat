package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_eg2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://skpatro.github.io/demo/iframes/");
	    
	    Thread.sleep(1000);
	    
	   String text = driver.findElement(By.xpath("//a[text()='Blogger']")).getText();
	   
	   System.out.println(text);
	   
	   driver.switchTo().frame(0);
	   String text1= driver.findElement(By.xpath("//p[text()='I am inside Frame']")).getText();
	   System.out.println(text1);
	   
	   //xpath by linked text
	   driver.switchTo().parentFrame(); //switch focus from frame to main page
	   String text2 = driver.findElement(By.linkText("Pavilion")).getText();
	   System.out.println(text2);
	   
	   //xpath by partial text
	   driver.switchTo().frame(1); // switch focus from main frame to frame2
	   String text3 = driver.findElement(By.partialLinkText("Cate")).getText();
	   System.out.println(text3);
	   
	   //xpath by liked text
	   driver.switchTo().parentFrame();
	  String text4 = driver.findElement(By.linkText("Blogger")).getText();
	   System.out.println(text4); 
		

	}

}
