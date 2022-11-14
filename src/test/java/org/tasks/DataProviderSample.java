package org.tasks;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.fb.BaseSample;

public class DataProviderSample extends BaseSample {

	@org.testng.annotations.Test(dataProvider="SampleData")
	public void savings(String username, String password) throws AWTException {
		
		getDriver();
		launchUrl("https://www.facebook.com/");
		locateElement("id", "email").sendKeys(username);
		locateElement("id", "pass").sendKeys(password);
		locateElement("name", "login").click();

	}

	@DataProvider(name = "SampleData")
	private Object[][] sendData() throws IOException {
		return new Object[][] {
			
			{excelData(0, 0),excelData(0, 1)},{excelData(1, 0),excelData(1, 1)}
			
		};

	}

}
