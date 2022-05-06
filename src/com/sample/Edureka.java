package com.sample;
//

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//

//	public static void main(String[] args) throws InterruptedException {
//
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.edureka.co/");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[@class='login_click login-vd giTrackElementHeader ']")).click();
//
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.findElement(By.id("si_popup_email")).sendKeys("zatyachristian@gmail.com");
//		driver.findElement(By.id("si_popup_passwd")).sendKeys("Lee6014brett#");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
//		driver.findElement(By.xpath("//img[@ class='img30']")).click();
//		Thread.sleep(3000);
//
//		driver.navigate().to("https://learning.edureka.co/my-profile");
//		WebElement fname = driver.findElement(By.xpath("//input[@name='data[User][email']"));
//		driver.navigate().to("/my-profile/career-service");
//
//		//
//
////	     Thread.sleep(5000);
////	     Select Profile = new Select(myProElement);
////	    Profile.selectByVisibleText("icon-profile-careers");
////	    
//		// driver.findElement(By.className("")).click();
//
//		// WebElement
//		// fname=driver.findElement(By.xpath("//input[@name='data[User][email']"));
//
//		//
//
//	}
//}

//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://demo.automationtesting.in/Alerts.html");
//		// Alert
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		driver.switchTo().alert().dismiss();
//		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
//		driver.switchTo().alert().getText();
//		driver.switchTo().alert().sendKeys("Za tya");
//		driver.switchTo().alert().accept();
//	}
//}
public class Edureka {

	public static void main(String[] args) throws InterruptedException {

//	System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
//
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/");
//	driver.manage().window().maximize();
//	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.name("firstname")).sendKeys("Banil");
//	Thread.sleep(1000);
//
//	driver.findElement(By.name("lastname")).sendKeys("Rayla");
//	Thread.sleep(1000);
//	driver.findElement(By.name("reg_email__")).sendKeys("raylachristian@gmail.com");
//	Thread.sleep(1000);
//	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("raylachristian@gmail.com");
//	driver.findElement(By.name("reg_passwd__")).sendKeys("beni12345");
//	Thread.sleep(1000);
//	WebElement multi = driver.findElement(By.xpath("//select[2]"));
//	Select sel= new Select(multi);
//	boolean multiple = sel.isMultiple();
//	System.out.println(multiple);
//	WebElement day = driver.findElement(By.name("birthday_day"));
//	Select day1= new Select(day);
//	day1.selectByIndex(1);
//	//WebElement month = driver.findElement(By.id("month"));

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");

		Thread.sleep(3000);

		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multi);

		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");
//		List<WebElement> options = s.getOptions();
//		for (WebElement webElement : options) {
//			System.out.println(""  +webElement.getText());
//			
		}
		
		
		
		
		

	}
