package com.JuicyShop_NN_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class DeliveryMethodPage extends BaseClass{
	
	@FindBy(xpath=" //input[starts-with(@id,”mat-radio-143”)]")
	WebElement radioBtn;
	@FindBy(xpath="//div/mat-sidenav-container/mat-sidenav-content/app-delivery-method/mat-card/div[4]/button[2]")
	WebElement contnBtn;

	public DeliveryMethodPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public PaymentShopPage deliveryMethodChoose()
	{
		Actions act=new Actions(driver);
	  // act.moveToElement(radioBtn).click().perform();
	  radioBtn.click();
	    act.moveToElement(contnBtn).click().perform();
	 
		
		return new PaymentShopPage(driver);
	}

}
