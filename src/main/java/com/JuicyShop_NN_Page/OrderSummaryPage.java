package com.JuicyShop_NN_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class OrderSummaryPage extends BaseClass{
	@FindBy(xpath="//span[@class=\"mat-button-wrapper\"]//span[text()='Place your order and pay']")
	WebElement placeOrder;
	

	public OrderSummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
  
	public OrderCompletionPage placeOrder()
	{
		placeOrder.click();
		return new OrderCompletionPage(driver);
		
	}
}
