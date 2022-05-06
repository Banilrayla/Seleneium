package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorDemo {
	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.album.alexflueras.ro/index.php");
//		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(5000, 0)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(-500, 0)");
//		Thread.sleep(1000);
//		
//		js.executeScript("window.scrollBy(-500, 0)");	
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(-5000, 0)");
//		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//driver.get("https://www.facebook.com/login/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement smartWatch = driver.findElement(By.xpath("(//img[@class='product-image'])[76]"));
		js.executeScript("arguments[0].scrollIntoView();", smartWatch);
		Thread.sleep(2000);

		
//		WebElement email = driver.findElement(By.id("email"));
//		js.executeScript("arguments[0].value='Beni.christian@gmail.com'", email);
//	Thread.sleep(1000);
//
//		WebElement pass = driver.findElement(By.name("pass"));
//		js.executeScript("arguments[0].value='1234'", pass);
//		Thread.sleep(1000);
//		WebElement log = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", log);
//		
		
		
	}
}
