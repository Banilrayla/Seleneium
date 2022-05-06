package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");

		Thread.sleep(3000);

		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multi);
		boolean multiple = s.isMultiple();
		System.out.println("To check multiple:" + multiple);
		System.out.println("-------------------------");
		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("Loadrunner");
		List<WebElement> options = s.getOptions();

		for (WebElement webElement : options) {
			System.out.println("Get the options:" + webElement.getText());

		}
		System.out.println("-------------------------");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement1 : allSelectedOptions) {
			System.out.println("Get all Selected option:" + webElement1.getText());

		}
		System.out.println("-------------------------");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("Get first Selected option:" + firstSelectedOption.getText());
		System.out.println("-------------------------");

		s.deselectByValue("1");
		s.deselectByIndex(2);
		s.deselectByVisibleText("Loadrunner");

	}
}
