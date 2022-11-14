package com.Training;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Training1 {

	@Test
	private void sample() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		WebElement closeBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closeBtn.clear();

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Xplade");
		searchBox.clear();

		WebElement enterBox = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		

		driver.get("");

		driver.close();
		
		enterBox.click();

		String xpathExpression = "//div[@class='_30jeq3']//div";

		List<WebElement> listPrices = driver.findElements(By.xpath(xpathExpression));

		List beforeList = new ArrayList();

		for (WebElement p : listPrices) {

			beforeList.add((p.getText().replace("\u20B9", "")));

		}
		
		driver.close();

		WebElement lowToHigh = driver.findElement(By.xpath("//div[text()='Price -- Low to High']"));
		lowToHigh.click();

		List<WebElement> listPrices2 = driver.findElements(By.xpath(xpathExpression));
		List afterList = new ArrayList();

		for (WebElement p1 : listPrices2) {

			afterList.add((p1.getText().replace("\u20B9", "")));

		}

		
		System.out.println(afterList);
		System.out.println(beforeList);

		if (beforeList.equals(afterList)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}

}
