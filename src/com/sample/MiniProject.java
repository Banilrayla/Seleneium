package com.sample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MiniProject {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//driver.findElement(By.linkText("New User Register Here")).click();
//driver.findElement(By.name("username")).sendKeys("benbrett1");
//driver.findElement(By.name("password")).sendKeys("benbrett1");
//driver.findElement(By.name("re_password")).sendKeys("benbrett1");
//driver.findElement(By.name("full_name")).sendKeys("Banl Gladston");
//driver.findElement(By.name("email_add")).sendKeys("zatyachristian@gmail.com");
//WebDriverWait wait =new WebDriverWait(driver, 30);
// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//table[@class='login']//img)[1]")));
		/* Entered the captcha manually using explicit wait */
//driver.findElement(By.name("tnc_box")).click();
//driver.findElement(By.xpath("(//input[@class='reg_button'])[1]")).click();
//driver.findElement(By.xpath("//a[@href='index.php']")).click();
		driver.findElement(By.name("username")).sendKeys("Banilbrett");
		driver.findElement(By.name("password")).sendKeys("benbrett1");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		WebElement loc = driver.findElement(By.xpath("(//select[@class='search_combobox'])[1]"));
		Select s = new Select(loc);
		s.selectByVisibleText("Sydney");
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByIndex(4);

		WebElement rooms = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		Select s2 = new Select(rooms);
		s2.selectByVisibleText("Standard");
		WebElement r_Nos = driver.findElement(By.name("room_nos"));
		Select s3 = new Select(r_Nos);
		s3.selectByIndex(8);

		WebElement checkIn = driver.findElement(By.xpath("(//input[@class='date_pick'])[1]"));
		checkIn.sendKeys("29/03/2022");
		WebElement checkOut = driver.findElement(By.xpath("(//input[@class='date_pick'])[2]"));

		checkOut.sendKeys("31/03/2022");

		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(adult);
		s4.selectByIndex(2);

		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(child);
		s5.selectByIndex(1);

		WebElement search = driver.findElement(By.xpath("(//input[@class='reg_button'])[1]"));
		search.click();

		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Banil");
		driver.findElement(By.id("last_name")).sendKeys("Rayla");
		driver.findElement(By.id("address")).sendKeys("Building2, apartment 12, fourth floor,street 223,Maadi");
		driver.findElement(By.id("cc_num")).sendKeys("1111111123888965");

		WebElement card_Type = driver.findElement(By.xpath("//select[@class='select_combobox']"));
		Select s6 = new Select(card_Type);
		s6.selectByVisibleText("American Express");

		WebElement month = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[1]"));
		Select s7 = new Select(month);
		s7.selectByIndex(1);

		WebElement year = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
		Select s8 = new Select(year);
		s8.selectByIndex(5);

		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("101");

		driver.findElement(By.xpath("(//input[@class='reg_button'])[1]")).click();
		driver.findElement(By.id("logout")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Screenshot\\adactin.png");
		FileUtils.copyFile(source, destination);

	}
}
