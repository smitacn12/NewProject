package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		WebElement username= driver.findElement(By.className("oxd-input oxd-input--active"));
		
		WebElement password= driver.findElement(By.className("oxd-input oxd-input--active"));
		
		username.sendKeys("admin123");
		
		WebElement loginbutton = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
		
		WebElement link = driver.findElement(By.linkText("Forgot your password?"));
		link.click();
		
	}

	
	
	
	
	
}
