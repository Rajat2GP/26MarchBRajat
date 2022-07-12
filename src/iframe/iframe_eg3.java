package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_eg3 {

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver", "D:\\\\Rajat\\\\VelocityTesting\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/iframe");
	    
	    Thread.sleep(2000);
	    
	   String text = driver.findElement(By.xpath("(//a[text()='Try it'])[3]")).getText();
	    System.out.println(text);
		
	    driver.switchTo().frame(0);
	   String text1 = driver.findElement(By.xpath("//h4[@class='output-heading']")).getText();
        System.out.println(text1);
	   
        driver.switchTo().parentFrame();
        String text2 = driver.findElement(By.xpath("(//a[text()='Try it'])[3]")).getText();
        System.out.println(text2);
	}

}
