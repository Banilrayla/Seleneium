package com.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop7 {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Banil");
		Thread.sleep(1000);

		driver.findElement(By.name("lastname")).sendKeys("Rayla");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("raylachristian@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("raylachristian@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("beni12345");
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select s = new Select(day);
		s.selectByValue("2");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByIndex(7);
		WebElement year = driver.findElement(By.id("year"));
		Select Y = new Select(year);
		Y.selectByVisibleText("1990");
		Thread.sleep(1000);
		WebElement gender = driver.findElement(By.className("_58mt"));
		Thread.sleep(1000);
		gender.click();
		driver.findElement(By.className("_8esa")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
	}
}