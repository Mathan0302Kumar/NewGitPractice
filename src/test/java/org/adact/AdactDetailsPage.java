package org.adact;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.BaseSample;

public class AdactDetailsPage extends BaseSample {

	public AdactDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement optlocation;

	@FindBy(id = "hotels")
	private WebElement opthotels;

	@FindBy(id = "room_type")
	private WebElement optRoomType;

	@FindBy(id = "room_nos")
	private WebElement optRoomNos;
	
	@FindBy(id = "datepick_in")
	private WebElement txtDatein;
	

	@FindBy(id = "datepick_out")
	private WebElement txtDateOut;
	

	@FindBy(id = "adult_room")
	private WebElement adultRoomNos;

	@FindBy(id = "Submit")
	private WebElement btnSubmit;

	public WebElement getOptlocation() {
		return optlocation;
	}

	public WebElement getOpthotels() {
		return opthotels;
	}

	public WebElement getOptRoomType() {
		return optRoomType;
	}

	public WebElement getOptRoomNos() {
		return optRoomNos;
	}
	

	public WebElement getTxtDatein() {
		return txtDatein;
	}

	public WebElement getTxtDateOut() {
		return txtDateOut;
	}

	public WebElement getAdultRoomNos() {
		return adultRoomNos;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

}