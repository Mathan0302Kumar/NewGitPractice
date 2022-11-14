package com.fb;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSample extends BaseSample{
	public static void main(String[] args) throws AWTException {
		
		
		
		BaseSample lib = new BaseSample();
		lib.getDriver();
		lib.launchUrl("https://www.chempoint.com/");
//		
//		LoginPage log = new LoginPage();
//		
//		WebElement txtUserName = log.getTxtUserName();
//		log.enterTxt(txtUserName, "Mathan Kumar");
//		
//		log.navigateRefresh();
//		
//		log.enterTxt(txtUserName, "Maddy");
//		
//		WebElement txtPassword = log.getTxtPassword();
//		log.enterTxt(txtPassword, "Maddy123");
//		
//		WebElement btnLogin = log.getBtnLogin();
//		log.btnClick(btnLogin);
		
		
		
		
		
		
	}
	
}
