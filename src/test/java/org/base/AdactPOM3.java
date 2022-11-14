package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.BaseSample;

public class AdactPOM3 extends BaseSample {
	
	public AdactPOM3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "address")
	private WebElement txtAddress;
	
	@FindBy(id = "cc_num")
	private WebElement txtccNum;
	
	@FindBy(id = "cc_type")
	private WebElement optccType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement optMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement optYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id = "book_now")
	private WebElement btnBook;
	
	@FindBy(name="order_no")
	private WebElement txtOrderNum;

	public WebElement getTxtOrderNum() {
		return txtOrderNum;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtccNum() {
		return txtccNum;
	}

	public WebElement getOptccType() {
		return optccType;
	}

	public WebElement getOptMonth() {
		return optMonth;
	}

	public WebElement getOptYear() {
		return optYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}
	

}
