package org.base;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.fb.BaseSample;

public class AdactTestNG extends BaseSample {

	@Test
	private void finalOutput() throws AWTException, IOException {

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

		AdactPOM1 nm = new AdactPOM1();
		 
		
		String data = nm.getData("E:\\Adactin.xlsx", "Sheet1", 1, 0);
		WebElement optlocation = nm.getOptlocation();
		nm.dropDownText(optlocation, "select", data);
		
		String data2 = nm.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 1);
		WebElement opthotels = nm.getOpthotels();
		nm.dropDownText(opthotels, "select",data2 );
		
		String data3 = nm.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 2);
		WebElement optRoomType = nm.getOptRoomType();
		nm.dropDownText(optRoomType, "select", data3);
		
		String data4 = nm.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 3);
		WebElement optRoomNos = nm.getOptRoomNos();
		nm.dropDownText(optRoomNos, "select", data4);
		
		String data5 = nm.getData("E:\\\\Adactin.xlsx", "Sheet1", 1,4);
		WebElement txtDatein = nm.getTxtDatein();
		txtDatein.clear();
		enterTxt(txtDatein, data5);
		
		String data6 = nm.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 5);
		WebElement txtDateOut = nm.getTxtDateOut();
		txtDateOut.clear();
		enterTxt(txtDateOut, data6);
		
		String data7 = nm.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 6);
		WebElement adultRoomNos = nm.getAdultRoomNos();
		enterTxt(adultRoomNos, data7);
		
		nm.getBtnSubmit().click();
		
		AdactPOM2 mk = new AdactPOM2();
		mk.getRadioBtnClk().click();
		mk.getBtnContinueclk().click();
		
		AdactPOM3 km = new AdactPOM3();
		String data8 = km.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 7);
		WebElement txtFirstName = km.getTxtFirstName();
		enterTxt(txtFirstName, data8);
		
		String data9 = km.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 8);
		WebElement txtLastName = km.getTxtLastName();
		enterTxt(txtLastName, data9);
		
		String data10 = km.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 9);
		WebElement txtAddress = km.getTxtAddress();
		enterTxt(txtAddress, data10);
		
		String data11 = km.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 10);
		WebElement txtccNum = km.getTxtccNum();
		enterTxt(txtccNum, data11);
		
		String data12 = km.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 11);
		WebElement optccType = km.getOptccType();
		enterTxt(optccType, data12);
		
		String data13 = km.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 12);
		WebElement optMonth = km.getOptMonth();
		enterTxt(optMonth, data13);
		
		String data14 = km.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 13);
		WebElement optYear = km.getOptYear();
		enterTxt(optYear, data14);
		
		String data15 = km.getData("E:\\\\Adactin.xlsx", "Sheet1", 1, 14);
		WebElement txtCvv = km.getTxtCvv();
		enterTxt(txtCvv, data15);
		
		km.getBtnBook().click();
		
		WebElement orderNum = km.getTxtOrderNum();
		String attribute = km.gettingAttribute(orderNum, "value");
		System.out.println("My order number is : "+attribute);
		
	    String data1for = km.getData1for("E:\\\\Adactin.xlsx", "Sheet1");
	    System.out.println(data1for);
	}

}
