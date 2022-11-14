package com.fb;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.function.Function;

import org.apache.poi.ss.formula.functions.Fixed;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSample {

	public static WebDriver driver;
	public static Actions actions;
	public static Robot robot;
	public static TakesScreenshot ts;
	public static Select select;
	public static Alert al;
	public static JavascriptExecutor executor;

	public void getDriver() throws AWTException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		actions = new Actions(driver);
		robot = new Robot();
		ts = (TakesScreenshot) driver;
		executor = (JavascriptExecutor) driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void getCurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public void toStringConvert() {
		String string = driver.toString();
		System.out.println(string);
	}

	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public void navigation(String url) {
		driver.navigate().to(url);
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	public void enterTxt(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void closeWindow() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}
	
	
	public void data(String names) {
		switch(names) {
		case "prime":
		WebElement element=driver.findElement(By.id(""));
		element.click();
		break;
		case "Commerce":
			WebElement element2=driver.findElement(By.id(""));
			element2.click();
			break;
		}
		
	}

	public WebElement locateElement(String locator, String Value) {

		WebElement element = null;
		switch (locator) {
		case "id":
			element = driver.findElement(By.id(Value));
			break;
		case "name":
			element = driver.findElement(By.name(Value));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(Value));
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		return element;
	}

	public String gettingText(WebElement element) {
		String text;
		text = element.getText();
		return text;
	}

	public String gettingAttribute(WebElement element, String Value) {
		String attribute;
		attribute = element.getAttribute(Value);
		return attribute;
	}

	public void rightClick() {
		actions.contextClick().perform();
	}

	public void DoubleClick() {
		actions.doubleClick().perform();
	}

	public void dragDrop(WebElement element1, WebElement element2) {
		actions.dragAndDrop(element1, element2).perform();
	}

	public void moveToElem(WebElement element) {
		actions.moveToElement(element).perform();
	}

	public void keyPress(int key) {
		robot.keyPress(key);
	}

	public void keyRelease(int key) {
		robot.keyRelease(key);
	}

	public void keyEnter(WebElement element, String data) {
		element.sendKeys(data, Keys.ENTER);

	}

	public void keyDownUp(CharSequence key, WebElement element, String text, CharSequence key1) {
		actions.keyDown(key).sendKeys(element, text).keyUp(key1).perform();
	}

	public void copyScreenshot(File element1, File path) throws IOException {
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		org.openqa.selenium.io.FileHandler.copy(element1, path);
	}

	public void dropdownIndex(WebElement element, String options, int index) {
		select = new Select(element);
		switch (options) {
		case "select":
			select.selectByIndex(index);
			break;
		case "deselect":
			select.deselectByIndex(index);
			break;
		default:
			System.out.println("Not valid");
			break;
		}
	}

	public void dropdownValue(WebElement element, String options, String Value) {
		select = new Select(element);
		switch (options) {
		case "select":
			select.selectByValue(Value);
			break;
		case "deselect":
			select.deselectByValue(Value);
			break;
		default:
			System.out.println("Not valid");
			break;
		}
	}

	public void dropDownText(WebElement element, String options, String text) {
		select = new Select(element);
		switch (options) {
		case "select":
			select.selectByVisibleText(text);
			break;
		case "deselect":
			select.deselectByVisibleText(text);
			break;
		default:
			System.out.println("Not valid");
			break;
		}
	}

	public void checkMultipleSelectOption(WebElement element) {
		select = new Select(element);
		boolean multiple = select.isMultiple();
		System.out.println(multiple);
	}

	private void selectAllOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> Options = select.getOptions();
		for (int i = 0; i < Options.size(); i++) {
			WebElement element2 = Options.get(i);
			String text = element2.getText();
			select.selectByVisibleText(text);
		}
	}

	public void deselectAllDropDown(WebElement element) {
		select = new Select(element);
		select.deselectAll();
	}

	public void gettingOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> Options = select.getOptions();
		for (int i = 0; i < Options.size(); i++) {
			WebElement element2 = Options.get(i);
			String text = element2.getText();
			System.out.println(text);
		}

	}

	public void gettingFirstSelectOption(WebElement element) {
		select = new Select(element);
		WebElement Options = select.getFirstSelectedOption();
		String text = Options.getText();
		System.out.println(text);
	}

	public void AllSelectedOptions(WebElement element) {
		select = new Select(element);
		List<WebElement> Options = select.getOptions();
		for (int i = 0; i < Options.size(); i++) {
			WebElement element2 = Options.get(i);
			String attribute = element2.getAttribute("value");
			System.out.println(attribute);
		}
	}

	public void alertBox(String alert) {
		al = driver.switchTo().alert();
		switch (alert) {
		case "accept":
			al.accept();
			break;
		case "dismiss":
			al.dismiss();
			break;
		case "getText":
			String text = al.getText();
			System.out.println(text);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

	public void alertEnterText(String data) {
		al = driver.switchTo().alert();
		al.sendKeys(data);
	}

	public void getParentWindow() {
		String prtWin = driver.getWindowHandle();
		System.out.println(prtWin);
	}

	public void getallWindowId() {
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
	}

	public void windowsHandling(int i) {
		String prtWin = driver.getWindowHandle();
		System.out.println(prtWin);
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		List<String> li = new ArrayList<>();
		li.addAll(allWin);
		int count = 0;
		for (String string : li) {
			if (count == i) {
				driver.switchTo().window(string);
			}
			count++;
		}

	}

	public void scrollDown(WebElement element) {
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrollUp(WebElement element) {
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void implicitWait(long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public WebElement webDriverWait(long seconds, String Value) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Value)));
		return element;
	}

	public void fluentWait(long seconds, long seconds1, final String locator, final String value, String data) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(seconds))
				.pollingEvery(Duration.ofSeconds(seconds1)).ignoring(org.openqa.selenium.NoSuchElementException.class);
		WebElement fwait = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {

				WebElement element = null;
				switch (locator) {
				case "id":
					element = driver.findElement(By.id(value));
					break;
				case "name":
					element = driver.findElement(By.name(value));
					break;
				case "xpath":
					element = driver.findElement(By.xpath(value));
					break;
				default:
					System.out.println("Invalid");
					break;
				}
				return element;
			}
		});
		fwait.sendKeys(data);
	}

	public void javaScriptInsert(String script, WebElement element) {
		executor.executeScript(script, element);
	}

	public void javaScriptClick(String script, WebElement element) {
		executor.executeScript(script, element);
	}

	public void javaScriptgetAttribute(String script, WebElement element) {
		Object name = executor.executeScript(script, element);
		System.out.println(name);
	}

	public void webTableDatas(WebElement element, String tagName) {
		List<WebElement> allRow = element.findElements(By.tagName(tagName));
		for (int i = 0; i < allRow.size(); i++) {
			WebElement row = allRow.get(i);
			String text = row.getText();
			System.out.println(text);
		}
	}

	public void webTableIterate(WebElement element, String tagName, String tagName1) {
		List<WebElement> allRow = element.findElements(By.tagName(tagName));
		for (int i = 0; i < allRow.size(); i++) {
			WebElement row = allRow.get(i);
			List<WebElement> tdata = row.findElements(By.tagName(tagName1));
			for (int j = 0; j < tdata.size(); j++) {
				WebElement element2 = tdata.get(j);
				String text = element2.getText();
				System.out.println(text);
			}
		}
	}

	public void webTabledataPresent(WebElement element, String tagName, String tagName1, String data) {
		List<WebElement> allRow = element.findElements(By.tagName(tagName));
		for (int i = 0; i < allRow.size(); i++) {
			WebElement row = allRow.get(i);
			List<WebElement> tdata = row.findElements(By.tagName(tagName1));
			for (int j = 0; j < tdata.size(); j++) {
				WebElement element2 = tdata.get(j);
				String text = element2.getText();
				if (text.equals(data)) {
					System.out.println(text);

				}
			}
		}

	}

	public String excelData(int rownum, int cellnum) throws IOException {
		
		
		Workbook w = new XSSFWorkbook(new FileInputStream(new File("E:\\Adactin.xlsx")));
		Sheet sheet = w.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		String data = null;
		switch (cellType) {
		case STRING:
			data = cell.getStringCellValue();
			break;
		case NUMERIC:
			double ncv = cell.getNumericCellValue();
			long l = (long) ncv;
			data = String.valueOf(l);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		return data;
	}

	public String excel(String filename, String pathname) throws IOException {
		String text = null;

		Workbook w = new XSSFWorkbook(new FileInputStream(new File(pathname)));
		Sheet sheet = w.getSheet(filename);

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				row.getCell(j).getStringCellValue();

			}

		}

		return text;

	}

	public Object[][] getExceldata() throws FileNotFoundException, IOException {
		Workbook w = new XSSFWorkbook(new FileInputStream(new File("E:\\Datas.xlsx")));
		Sheet sheet = w.getSheetAt(0);
		Row row = sheet.getRow(0);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		int numberOfCells = row.getPhysicalNumberOfCells();
		Object[][] a = new Object[numberOfRows - 1][numberOfCells];
		for (int i = 1; i < numberOfRows; i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row2.getCell(j);
				String cellValue = cell.getStringCellValue();
				a[i - 1][j] = cellValue;

			}

		}
		return a;

	}

	public String propertyFile(String s) throws IOException {

		File file = new File("C:\\\\Users\\\\madha\\\\eclipse-workspace\\\\FrameworkBase\\\\Adact.properties");
		FileReader filereader = new FileReader(file);
		Properties properties = new Properties();
		properties.load(filereader);
		return properties.get(s).toString();

	}

	public String getData(String location, String sheetname, int rownum, int cellno) throws IOException {

		File file = new File(location);
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellno);
		CellType cellType = cell.getCellType();
		String data = null;
		switch (cellType) {
		case STRING:
			data = cell.getStringCellValue();
			break;
		case NUMERIC:
			double ncv = cell.getNumericCellValue();
			long l = (long) ncv;
			data = String.valueOf(l);
			break;
		default:
			System.out.println("Invalid");
			break;
		}
		return data;
	}

	public String getData1for(String location, String sheetname) throws IOException {

		File file = new File(location);
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet(sheetname);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String string = cell.toString();
				CellType cellType = cell.getCellType();
				String data = null;
				switch (cellType) {
				case STRING:
					data = cell.getStringCellValue();
					break;
				case NUMERIC:
					double ncv = cell.getNumericCellValue();
					long l = (long) ncv;
					data = String.valueOf(l);
					break;
				default:
					System.out.println("Invalid");
					break;

				}
				return data;

			}
		}
		return null;

	}
	

}
