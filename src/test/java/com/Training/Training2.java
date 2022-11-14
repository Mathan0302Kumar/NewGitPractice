package com.Training;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Training2 {
	
	@Test
	private void samp() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		WebElement position = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Point location = position.getLocation();
		System.out.println(location);
		System.out.println(position.getSize());
		madhan kumar whar are u doung da nayad
		
	}

}
