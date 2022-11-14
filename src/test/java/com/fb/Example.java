package com.fb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// WebElement findElement = driver.findElement(By.xpath("//div[text='Don't
		// Change']"));
		// findElement.click();
		
		WebElement findElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		findElement.click();
		
		WebElement button = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).perform();;
		
		
		List<WebElement> pages = driver.findElements(By.xpath(
				"//div[@class='_3XS_gI']"));

		for (WebElement webElement : pages) {
			
			String text = webElement.getText();
			System.out.println(text);
			
			WebElement findElement2 = webElement.findElement(By.xpath("//div[@class='_3XS_gI']//child::a[3]"));
			findElement2.click();
		
		}
	}

}
