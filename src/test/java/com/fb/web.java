package com.fb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class web {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement tableData = driver.findElement(By.id("countries"));

		WebElement findElements = tableData
				.findElement(By.xpath("//td[text()='Kabul']//preceding-sibling::td//child::input"));
		findElements.click();
		
		WebElement dd = tableData
				.findElement(By.xpath("//td[text()='Kabul']//following-sibling::td[1]"));
		String text = dd.getText();
		System.out.println(text);

		WebElement findElement3 = tableData
				.findElement(By.xpath("//td[text()='Luanda']//preceding-sibling::td//child::input"));
		findElement3.click();
		
		
		WebElement findElement = tableData.findElement(By.xpath("//td[text()='Paris']//preceding-sibling::td//input"));
		findElement.click();
		Thread.sleep(3000);
		
		List<WebElement> allrows = tableData.findElements(By.xpath("//tr"));
		int size = allrows.size();
		System.out.println(size);
		
		List<WebElement> columns = tableData.findElements(By.xpath("//tr[1]//td"));
		int size2 = columns.size();
		
		List<WebElement> kk = tableData.findElements(By.xpath("//tr//td[1]//input"));
		int count = 0;
		for (int i = 0; i < kk.size(); i++) {
			WebElement mm = kk.get(i);
			if (mm.isSelected()) {
				System.out.println(i+1);
				count++;
				WebElement country = mm.findElement(By.xpath("//tr["+ (i+2) +"]//td[2]"));
				System.out.println(country.getText());
			
				
			}

		}

		System.out.println(count);
	}
}
