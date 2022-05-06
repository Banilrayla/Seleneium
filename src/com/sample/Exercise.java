package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise {
	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	

		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));

		Select first = new Select(element);
		boolean multiple = first.isMultiple();
		System.out.println(multiple);

//		List<WebElement> Options = first.getAllSelectedOptions();
//		for (WebElement ele : Options) {
//			System.out.println("Get all options   " + ele);
		}
	}
