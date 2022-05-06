package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyna17 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-formal-shirts");
		List<WebElement> all_Prices = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span"));
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i<all_Prices.size();i++)
				{
			
					String replaceAll= all_Prices.get(i).getText().replaceAll("Rs. ", "");
					int parseInt= Integer.parseInt(replaceAll);
					a.add(parseInt);
		}
		
	int size= a.size();
	System.out.println("List of all products; "+size);
	System.out.println("Minimum Price : " +Collections.min(a));
	System.out.println("Maximum Price : " +Collections.max(a));
}
}