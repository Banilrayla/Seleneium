package com.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class WaitF {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
	
//Implicit wait
//		driver.findElement(By.xpath("//a[contains	(text(),'Create New Account')]")).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
//		WebElement fName = driver.findElement(By.name("firstname"));
//		fName.sendKeys("Banil");
//	}}
		
		
		

		//Explicitly wait
		
		
//		driver.findElement(By.xpath("//a[contains	(text(),'Create New Account')]")).click();
//		WebDriverWait wait =new WebDriverWait(driver, 30);
//		WebElement fName = wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
//		fName.sendKeys("Banil");
//	}}




		
	//	Fluent wait
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

.withTimeout(Duration.ofSeconds(10))
 
.pollingEvery(Duration.ofSeconds(1))

.ignoring(NoSuchElementException.class);



WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

public WebElement apply(WebDriver driver) {

return driver.findElement(By.id("foo"));

}

});

foo.sendKeys("1232");
}}		

