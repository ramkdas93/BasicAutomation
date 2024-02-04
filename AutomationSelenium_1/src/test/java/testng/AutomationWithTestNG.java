package testng;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationWithTestNG {

	WebDriver driver;
	
	//@Test (invocationCount  = 3)   //This code runs 3 times.
	public void preSetup() {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		driver.close();
	}
	
	@Test
	public void getLogin() {
		
	}
	
	
}
