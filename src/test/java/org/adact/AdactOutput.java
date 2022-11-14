package org.adact;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.fb.BaseSample;

public class AdactOutput extends BaseSample {

	public static void main(String[] args) throws AWTException {

		BaseSample m = new BaseSample();
		m.getDriver();
		m.launchUrl("https://adactinhotelapp.com/");
		m.implicitWait(30);

		AdactLoginPage n = new AdactLoginPage();
		WebElement txtUsername = n.getTxtUsername();
		txtUsername.sendKeys("Maddy0302");
		WebElement txtpassword = n.getTxtpassword();
		txtpassword.sendKeys("maddy@0302");
		WebElement btnLogin = n.getBtnLogin();
		btnLogin.click();

		AdactDetailsPage mn = new AdactDetailsPage();

		WebElement optlocation = mn.getOptlocation();
		Select select = new Select(optlocation);
		select.selectByIndex(5);

		WebElement opthotels = mn.getOpthotels();
		Select select1 = new Select(opthotels);
		select1.selectByIndex(3);

		WebElement optRoomType = mn.getOptRoomType();
		Select select2 = new Select(optRoomType);
		select2.selectByIndex(2);
		
		WebElement txtDatein = mn.getTxtDatein();
		txtDatein.clear();
		txtDatein.sendKeys("24/05/2022");
		
		WebElement txtDateOut = mn.getTxtDateOut();
		txtDateOut.clear();
		txtDateOut.sendKeys("25/05/2022");

		WebElement adultRoomNos = mn.getAdultRoomNos();
		Select select3 = new Select(adultRoomNos);
		select3.selectByIndex(3);

		WebElement btnSubmit = mn.getBtnSubmit();
		btnSubmit.click();

		AdactHotelBook mnk = new AdactHotelBook();

		WebElement radioBtnClk = mnk.getRadioBtnClk();
		radioBtnClk.click();

		WebElement btnContinueclk = mnk.getBtnContinueclk();
		mnk.getBtnContinueclk().click();

		AdactFinalPage rmnk = new AdactFinalPage();

		WebElement txtFirstName = rmnk.getTxtFirstName();
		txtFirstName.sendKeys("Virat");

		WebElement txtLastName = rmnk.getTxtLastName();
		txtLastName.sendKeys("Kohli");

		WebElement txtAddress = rmnk.getTxtAddress();
		txtAddress.sendKeys("Chennai");

		WebElement txtccNum = rmnk.getTxtccNum();
		txtccNum.sendKeys("9876647883737383");

		WebElement optccType = rmnk.getOptccType();
		Select select5 = new Select(optccType);
		select5.selectByIndex(2);

		WebElement optMonth = rmnk.getOptMonth();
		Select select6 = new Select(optMonth);
		select6.selectByIndex(3);

		WebElement optYear = rmnk.getOptYear();
		Select select7 = new Select(optYear);
		select7.selectByIndex(5);

		WebElement txtCvv = rmnk.getTxtCvv();
		txtCvv.sendKeys("420");

		WebElement btnBook = rmnk.getBtnBook();
		btnBook.click();

	}

}
