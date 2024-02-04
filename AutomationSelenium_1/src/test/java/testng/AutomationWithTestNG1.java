package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationWithTestNG1 {
	
	WebDriver driver;
	@Test (priority = 2)
	public void automationTestNG() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class=\"fa fa-lock\"]")).click();
		//driver.close();
		
	}
	@Test (priority  = 1)
	public void automationTestNG1() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class = 'material-icons card_travel']")).click();
		//driver.close();
		
	}
	
}
