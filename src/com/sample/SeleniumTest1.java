package com.sample;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
	
	
private static String title;
private static String currentUrl;
private static String pageSource;

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();// Upcasting
	
	driver.get("https://www.amazon.in//");
	//driver.manage().window().maximize();//maximize
	
	//navigation methods
	
//	driver.navigate().to("https://www.facebook.com/");  //navigation 4 methods 
//	
//	Thread.sleep(3000);
	
//	driver.navigate().back();
//	
//	driver.navigate().forward();
//	
//	driver.navigate().refresh();
	
	//driver.quit();//terminate entire browser
	//driver.close();// close the current tab
	
	
	
	
	 String title = driver.getTitle();//shortcut key control + 2 and enter or just press ctrl 2 and look down
System.out.println(title);
//currentUrl = driver.getCurrentUrl();
//System.out.println(currentUrl);	
//pageSource = driver.getPageSource();
//System.out.println(pageSource);
     Dimension size =new Dimension(500,500);//dimension is a class // import Selenium// ref name is size saved width and height//left
     driver.manage().window().setSize(size);
     Point position =new Point(250,250);//dimension is a class // import Selenium// ref name is size saved width and height//left
     driver.manage().window().setPosition(position);
}
}





