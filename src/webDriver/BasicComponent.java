package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicComponent {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		Thread.sleep(2000);
//		driver.get("https://www.google.co.in/");
//		
//		
//		driver.navigate().back();
//		
//
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
//		
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.close();
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("smitanagrale3@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Happy@@1245");
		
WebElement loginbutton = driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		loginbutton.click();
		WebElement link = driver.findElement(By.linkText("Log in"));
		link.click();
		
		WebElement l = driver.findElement(By.name("login"));
		l.click();
		
		
		
		
	}

}
