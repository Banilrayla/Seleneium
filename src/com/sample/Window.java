  package com.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.flipkart.com/?ef_id=438336f6108d10f5fd4054c25b9cd13d:G:s&s_kwcid=AL!739!10!75797725410687!75797749220090&semcmpid=sem_F1167BY7_Brand_adcenter");
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

		WebElement trav = driver.findElement(By.linkText("Travel"));
		a.contextClick(trav).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

//		
		// Set<String> windowIds = driver.getWindowHandles();
//		
		// Iterator<String> iter= windowIds.iterator();
//		
//		
//		String mainwindow= iter.next();
//		
		// String childwindow=iter.next();
//		
		// String childwindow1=iter.next();
//		String childwindow2=iter.next();
//		
////		driver.switchTo().window(childwindow2);
////		System.out.println(driver.getTitle());
////		Thread.sleep(1000);
////
////		driver.switchTo().window(childwindow1);
////		System.out.println(driver.getTitle());
////		Thread.sleep(1000);
//		driver.switchTo().window(childwindow);
//		System.out.println(driver.getTitle());
//		

//		
//	}}

//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
//		System.out.println(driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list = new ArrayList<String>(windowHandles);
		for (String string : list) {
			System.out.println(string);
			System.out.println(driver.switchTo().window(string).getTitle());
			String s = "Flight Booking | Book Flight Tickets at Lowest Airfare on Flipkart.com";
			for (String string2 : list) {

				if (driver.switchTo().window(string2).getTitle().equalsIgnoreCase(s))
					break;

			}
//		

		}
	}
}

//	}
//}
