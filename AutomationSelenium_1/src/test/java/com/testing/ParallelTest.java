package com.testing;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class ParallelTest {

	@Test 
	public void openBrowser1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotwire.com");
		driver.manage().window().maximize();
		ClassA.Test1();
		ClassB.Test4();
	}
	
	@Test
	public void openBrowser2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotwire.com");
		driver.manage().window().maximize();
		ClassC.Test7();
		ClassA.Test3();
	}
	
	@Test
	public void openBrowser3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		ClassB.Test4();
		ClassC.Test7();
	}
}
