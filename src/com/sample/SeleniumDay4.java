package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
				driver.get("https://www.facebook.com/login/");
//		
		WebElement e = driver.findElement(By.id("email"));	
	e.sendKeys("james@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("abcd1234");
//		driver.findElement(By.name("login")).click();
		
		
	   driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();// used chropath extensions
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Banil");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("Rayla");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("beni.christian@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
	    Thread.sleep(1000);
		driver.findElement(By.className("_8esa")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		driver.close();
		//driver.get("https://www.ebay.com/");
		//System.out.println(driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@id='rtm_list1']/div[1]/a[1]/div[2]/div[1]/div[1]/div[2]/div[2]")).getCssValue("text-align"));
//	driver.get("https://www.sugarcrm.com/au/request-demo/");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("firstname")).sendKeys("Banil");
//		Thread.sleep(3000);
//		driver.findElement(By.name("firstname")).clear();
//		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
	}}
	
	
