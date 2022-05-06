package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("Java");
		driver.switchTo().defaultContent();
		WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multi.click();
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
				//.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/iframe[1]"));
		driver.switchTo().frame(frame1);
		WebElement frame2 = driver
				.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/iframe[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		driver.switchTo().defaultContent();
	}
}