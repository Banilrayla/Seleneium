package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actin11 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
////		DRIVER.GET("HTTP://WWW.LEAFGROUND.COM/PAGES/DROP.HTML");
////		ACTIONS A = NEW ACTIONS(DRIVER);
////		WEBELEMENT DRAG_GRAB = DRIVER.FINDELEMENT(BY.ID("DRAGGABLE"));
////		WEBELEMENT DROP_TARGET = DRIVER.FINDELEMENT(BY.ID("DROPPABLE"));
////		A.DRAGANDDROP(DRAG_GRAB, DROP_TARGET).BUILD().PERFORM();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		 WebElement best_Sellers =
		 driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']"));
		 a.contextClick(best_Sellers).build().perform();
		WebElement all = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		a.click(all).build().perform();

		Thread.sleep(3000);
		WebElement movers = driver.findElement(By.xpath("(//a[@class='hmenu-item'])[3]"));
		a.clickAndHold(movers).build().perform();
		Thread.sleep(3000);
		WebElement kindle = driver.findElement(By.xpath("//a[@data-menu-id='4']"));
		a.moveToElement(kindle).build().perform();
		a.click(kindle).build().perform();
		Thread.sleep(1000);
		WebElement close = driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']"));
		a.moveToElement(close).build().perform();
		a.click(close).build().perform();
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(text).build().perform();
		a.clickAndHold(text).build().perform();
		Thread.sleep(2000);
		a.release().build().perform();
		text.sendKeys("iphone13pro");
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		a.moveToElement(search).build().perform();
		a.click(search).build().perform();

	}
}
//}}
//
//}
//		try {
//		      // Navigate to Url
//		      driver.get("https://google.com");
//
//		      // Store 'google search' button web element
//		      WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
//		      Actions actionProvider = new Actions(driver);
//		      // Perform click-and-hold action on the element
//		      actionProvider.clickAndHold(searchBtn).build().perform();
//		      Thread.sleep(3000);
//		    } finally {
//		      driver.quit();
//		    }
//		  }
//		}