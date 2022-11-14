package org.tasks;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fb.BaseSample;

public class AssertSample extends BaseSample {

	@BeforeClass
	private void amethod() throws AWTException {

		getDriver();
		launchUrl("https://www.facebook.com/");

	}

	@Test
	private void beforeClass() {

		WebElement txtUserName = locateElement("id", "email");
		enterTxt(txtUserName, "Madhan");
		String attribute = gettingAttribute(txtUserName, "value");
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals("madhan", attribute);
		

		WebElement txtPass = locateElement("id", "pass");
		enterTxt(txtPass, "maddy123");
		String attribute2 = gettingAttribute(txtPass, "value");
		assert1.assertEquals("Madhan", attribute);
		

		WebElement btnLogin = locateElement("name", "login");
		boolean enabled = btnLogin.isEnabled();
		assert1.assertTrue(enabled);
		btnLogin.click();

	}
	

}
