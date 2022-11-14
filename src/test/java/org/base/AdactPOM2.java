package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.BaseSample;

public class AdactPOM2 extends BaseSample {
	
	public AdactPOM2() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "radiobutton_0")
	private WebElement radioBtnClk;
	
	@FindBy(id = "continue")
	private WebElement btnContinueclk;

	public WebElement getRadioBtnClk() {
		return radioBtnClk;
	}

	public WebElement getBtnContinueclk() {
		return btnContinueclk;
	}
	

}
