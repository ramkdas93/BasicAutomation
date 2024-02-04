package generic;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.MasterPageFactory;

public class AutomationBasic {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();  
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://automationexercise.com");
		driver.manage().window().maximize();
		
		MasterPageFactory obj = new MasterPageFactory(driver);
		obj.getSignup().click();
		obj.getEmail().sendKeys("ramkdas@me.com");
		obj.getPassword().sendKeys("ramkdas123!");
		obj.getLogin().click();
		
		driver.close(); 

	
	}
}
