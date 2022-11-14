package com.jsample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.seleniumeasy.com/table-records-filter-demo.html");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement findElement = driver.findElement(By.xpath("//button[text()='Green']"));
		findElement.click();

		List<WebElement> all = findElement.findElements(By.xpath("//table"));
		for (int i = 0; i < all.size(); i++) {

			WebElement element = all.get(i);
			if (element.isDisplayed()) {
            
				String text = element.getText();
				System.out.println(text);
			}
		}
		
		WebElement findElement2 = driver.findElement(By.xpath("//a[contains(text(),'Progress Bars &')]"));
		findElement2.click();
		List<WebElement> bars = driver.findElements(By.xpath("//a[contains(text(),'Progress Bars &')]//following-sibling::ul"));
		for (int i = 0; i < bars.size(); i++) {
			
			WebElement webElement = bars.get(i);
			String text = webElement.getText();
			System.out.println(text);
			
		}
		

		//
		// WebElement findElement2 =
		// driver.findElement(By.xpath("//input[@id='checkbox1']"));s
		// executor.executeScript("arguments[0].click();", findElement2);
		// WebElement findElement7 =
		// driver.findElement(By.xpath("//input[@id='checkbox4']"));
		// executor.executeScript("arguments[0].click();", findElement7);
		// WebElement findElement3 = driver.findElement(By.xpath("//a[text()='Input
		// Forms']"));
		// executor.executeScript("arguments[0].click();", findElement3);
		// List<WebElement> findElements = driver
		// .findElements(By.xpath("//a[text()='Input Forms']//following::ul[1]"));
		// for (int i = 0; i < findElements.size(); i++) {
		// WebElement webElement = findElements.get(i);
		// String text = webElement.getText();
		// System.out.println(text);
		//
		// }

	}

}
