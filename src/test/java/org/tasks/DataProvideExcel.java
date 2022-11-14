package org.tasks;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fb.BaseSample;

public class DataProvideExcel extends BaseSample {
	

	@DataProvider(name = "SampleData")
	private Object[][] getData() throws IOException {

		Object[][] data = getExceldata();

		return data;

	}



	@org.testng.annotations.Test(dataProvider = "SampleData")
	public void aSavings(String username, String password) throws AWTException {
		getDriver();
		launchUrl("https://www.facebook.com/");

		locateElement("id", "email").sendKeys(username);
		locateElement("id", "pass").sendKeys(password);
		locateElement("name", "login").click();

	}
	
	

}
