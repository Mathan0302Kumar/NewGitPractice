package org.base;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fb.BaseSample;

public class DataProviderAdact extends BaseSample {

	@org.testng.annotations.Test
	public void tc0() throws AWTException, IOException {

		BaseSample m = new BaseSample();
		m.getDriver();
		String url = m.propertyFile("url");
		m.launchUrl(url);
		m.implicitWait(30);

		AdactPOM mn = new AdactPOM();

		String name = mn.propertyFile("username");
		WebElement txtUsername = mn.getTxtUsername();
		enterTxt(txtUsername, name);
		WebElement txtpassword = mn.getTxtpassword();
		String pass = mn.propertyFile("password");
		enterTxt(txtpassword, pass);
		mn.getBtnLogin().click();

	}

	@Test(dataProvider = "SampleData")
	private void tc1(String location, String hotels, String roomtype, String roomnos, String datein, String dateout,
			String adultroomnum) {

		AdactPOM1 nm = new AdactPOM1();

		WebElement optlocation = nm.getOptlocation();
		nm.dropDownText(optlocation, "select", location);

		WebElement opthotels = nm.getOpthotels();
		nm.dropDownText(opthotels, "select", hotels);

		WebElement optRoomType = nm.getOptRoomType();
		nm.dropDownText(optRoomType, "select", roomtype);

		WebElement optRoomNos = nm.getOptRoomNos();
		nm.dropDownText(optRoomNos, "select", roomnos);

		WebElement txtDatein = nm.getTxtDatein();
		txtDatein.clear();
		enterTxt(txtDatein, datein);

		WebElement txtDateOut = nm.getTxtDateOut();
		txtDateOut.clear();
		enterTxt(txtDateOut, dateout);

		WebElement adultRoomNos = nm.getAdultRoomNos();
		enterTxt(adultRoomNos, adultroomnum);

		nm.getBtnSubmit().click();

		AdactPOM2 mk = new AdactPOM2();
		mk.getRadioBtnClk().click();
		mk.getBtnContinueclk().click();

	}

	@Test(dataProvider = "SampleData1")
	private void tc2(String firstname, String lastname, String address, String ccnum, String cctype, String ccmonth,
			String ccyear, String cvv) {

		AdactPOM3 km = new AdactPOM3();

		WebElement txtFirstName = km.getTxtFirstName();
		enterTxt(txtFirstName, firstname);

		WebElement txtLastName = km.getTxtLastName();
		enterTxt(txtLastName, lastname);

		WebElement txtAddress = km.getTxtAddress();
		enterTxt(txtAddress, address);

		WebElement txtccNum = km.getTxtccNum();
		enterTxt(txtccNum, ccnum);

		WebElement optccType = km.getOptccType();
		enterTxt(optccType, cctype);

		WebElement optMonth = km.getOptMonth();
		enterTxt(optMonth, ccmonth);

		WebElement optYear = km.getOptYear();
		enterTxt(optYear, ccyear);

		WebElement txtCvv = km.getTxtCvv();
		enterTxt(txtCvv, cvv);

		km.getBtnBook().click();

		WebElement orderNum = km.getTxtOrderNum();
		String attribute = km.gettingAttribute(orderNum, "value");
		System.out.println("My order number is : " + attribute);

	}

	@DataProvider(name = "SampleData")
	private Object[][] sendData() throws IOException {
		return new Object[][] {

				{ excelData(1, 0), excelData(1, 1), excelData(1, 2), excelData(1, 3), excelData(1, 4), excelData(1, 5),
						excelData(1, 6) }

		};

	}

	@DataProvider(name = "SampleData1")
	private Object[][] sendData1() throws IOException {
		return new Object[][] {

				{ excelData(1, 7), excelData(1, 8), excelData(1, 9), excelData(1, 10), excelData(1, 11),
						excelData(1, 12), excelData(1, 13), excelData(1, 14) }

		};

	}
	
	

}
