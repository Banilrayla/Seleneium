//package com.sample;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class Robo12 {
//
//	public static void main(String[] args) throws AWTException {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.amazon.in/");
//		Actions a = new Actions(driver);
//
//		WebElement best_Sellers = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
//
//		a.contextClick(best_Sellers).build().perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//		WebElement mobiles = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_1']"));
//		a.contextClick(mobiles).build().perform();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		WebElement todayDeals = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']"));
//		a.contextClick(todayDeals).build().perform();
//
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//
//	}
//}




package com.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robo12 {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/?ef_id=438336f6108d10f5fd4054c25b9cd13d:G:s&s_kwcid=AL!739!10!75797725410687!75797749220090&semcmpid=sem_F1167BY7_Brand_adcenter");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		a.click(button).build().perform();
		WebElement topOffers = driver.findElement(By.xpath("//div[@class='xtXmba']"));

		a.contextClick(topOffers).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement groc = driver.findElement(By.linkText("Grocery"));
		a.contextClick(groc).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement trav = driver.findElement(By.xpath("//div[text()='Travel']"));
		a.contextClick(trav).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
}