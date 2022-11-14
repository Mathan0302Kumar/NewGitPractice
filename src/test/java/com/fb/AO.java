package com.fb;

import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AO {

	public static void main(String[] args) throws IOException, InvalidFormatException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		// WebDriver driver = new ChromeDriver();
		//
		// driver.get("https://www.diy.com/");
		// driver.manage().window().maximize();
		//
		// WebElement findElement = driver.findElement(By.xpath("//span[text()='Sign
		// in']"));
		// findElement.click();
		// driver.findElement(By.name("email")).sendKeys("madhan511kumar@gmail.com");
		// driver.findElement(By.name("password")).sendKeys("maddy@0302");
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("//span[@class='e433fa60 f9f4120c']")).click();
		
		
		
		
		
		
		
		
		
		//
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement tableData = driver.findElement(By.id("customers"));
		List<WebElement> allRow = tableData.findElements(By.tagName("tr"));
		int len = allRow.size();
		for (int i = 0; i < len; i++) {
			
			WebElement row = allRow.get(i);
			String text2 = row.getText();
			System.out.println(text2);
			
//			System.out.println("************************************");
//			List<WebElement> tdata = row.findElements(By.tagName("td"));
//			for (int j = 0; j < tdata.size(); j++) {
//				if (j % 2 == 0) {
//					WebElement ele = tdata.get(j);
//					String text = ele.getText();
//					System.out.println(text);
//
//				}
//
//			}
//
	}

	}

}
