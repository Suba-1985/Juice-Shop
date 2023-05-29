package com.JuicyShop_NN_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class AddressSelectPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='Add New Address']")
	WebElement newAddressBtn;
	@FindBy(xpath="//input[starts-with(@id,”mat-radio-143”)]")
	WebElement radiobtn;
	@FindBy(xpath="//input[@class=\"mat-radio-input\" and @id=\"mat-radio-120-input\"]")
	WebElement eltradio;
	@FindBy (xpath="//*[@id=\"card\"]/app-address/mat-card/button/span[1]/span")
	WebElement continueBtn;

	public AddressSelectPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public AddressCreatePage newAddressClick()
	{
		newAddressBtn.click();
		return new AddressCreatePage(driver);
	}
	
	
	public DeliveryMethodPage addressSelection() {
		
		Actions act=new Actions(driver);
		act.moveToElement(radiobtn).click().perform();
		//eltradio.click();
		continueBtn.click();
		return new DeliveryMethodPage(driver);
	}

}
