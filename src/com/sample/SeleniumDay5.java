package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
public class SeleniumDay5
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.findElement(By.name("lastname")).sendKeys("Rayla");
		driver.findElement(By.name("reg_email__")).sendKeys("beni.christian@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("beni.christian@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select Day =new Select(day);
		Day.selectByValue("2");
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select Month= new Select(month);
		Month.selectByValue("2");
         WebElement year = driver.findElement(By.id("year"));
         Select Year= new Select(year);
         Year.selectByVisibleText("2002");
         Thread.sleep(1000);
         WebElement gender = driver.findElement(By.className("_58mt"));
         Thread.sleep(1000);
         gender.click();
         
         
         driver.findElement(By.name("websubmit")).click();
         
         Thread.sleep(1000);
         
 		
 		driver.close();
	
//		Select sel=new Select(element);
//		sel.selectByValue("11");
//		
//		
//		
//		WebElement sel=driver.findElement(By.id("month"));
//		sel.selectByValue("Mar");
//		WebElement element2=driver.findElement(By.name("birthday_year"));
//        sel.selectByValue("1980");
//		

}
}
