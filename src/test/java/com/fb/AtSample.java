package com.fb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.function.Function;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AtSample {
	public static void main(String[] args) throws IOException {

		final WebDriver driver = new ChromeDriver();
		TakesScreenshot ss = (TakesScreenshot) driver;
		File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(""));
		org.openqa.selenium.io.FileHandler.copy(screenshotAs, new File(""));
		Alert alert = driver.switchTo().alert();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement findElement = driver.findElement(By.id("email"));
		executor.executeScript("arguments[0].setAttribute('value','Ram')", findElement);
		executor.executeScript("arguments[0].scrollIntoView(true)", findElement);
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement until = driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		
		WebElement until2 = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return driver.findElement(By.id("email"));
			}
			
			
		});
		until2.sendKeys("jdhcfuh");
		
		
		
		
		
		
		
		

		File file = new File("C:\\Users\\madha\\eclipse-workspace\\FrameworkBase\\Excel Sheets\\Datas.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Datas");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();

				switch (type) {

				case STRING:
					String text = cell.getStringCellValue();
					System.out.println(text);

					break;

				case NUMERIC:

					if (DateUtil.isCellDateFormatted(cell)) {

						Date date = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMMM-yyyy");
						String format = dateformat.format(date);
						System.out.println(format);

					} else {

						double d = cell.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String num = b.toString();
						System.out.println(num);

					}

					break;

				default:
					break;
				}
			}

		}

	}

}
