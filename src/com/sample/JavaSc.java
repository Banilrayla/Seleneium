package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(2000);

		js.executeScript("window.scroll(0, 0)", "");
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
		js.executeScript("arguments[0].click()", mobile);
	}
}