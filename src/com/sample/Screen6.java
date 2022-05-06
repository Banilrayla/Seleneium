package com.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen6 {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Banil");
		Thread.sleep(1000);
		
		driver.findElement(By.name("lastname")).sendKeys("Rayla");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("beni.christian@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("beni.christian@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
	    Thread.sleep(1000);
	    
	    
		driver.findElement(By.className("_8esa")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\error.png");
//		FileUtils.copyFile(source, destination);

		TakesScreenshot screen= (TakesScreenshot) driver;
			File source= screen.getScreenshotAs(OutputType.FILE);
			File destination= new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\error1.png");
			FileUtils.copyFile(source, destination);
	}
}