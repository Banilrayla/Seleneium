package com.sample;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class Alert9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		// Alert
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		// confirm
		WebElement confirm = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confirm.click();
		WebElement cancel_button = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		cancel_button.click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);

		// promptAlert
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(3000);
		
		WebElement Prompt_click = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		Prompt_click.click();
		Thread.sleep(3000);
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().sendKeys("Banil");
		driver.switchTo().alert().accept();
		WebElement text = driver.findElement(By.id("demo1"));
		System.out.println(text.getText());
	}

	
	
	
}
