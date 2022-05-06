package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {
	
	 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();//maximize
		
		//WebElement textBox=driver.findElement(By.id("gsfi"));
		
		//textBox.sendKeys("google is gresat");

		
		//driver.close();
		
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kokoo");
	
	Thread.sleep(4000);

	driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
		
	}

}

