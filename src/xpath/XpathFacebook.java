package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {
	

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		driver.manage().window().maximize();
		
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("smitanagrale3@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("Kajal@1245");
		
		WebElement l = driver.findElement(By.xpath("//button[@name='login']"));
		l.click();
		
		
		
		
	}


	
	

}
