package com.JuicyShop_NN_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage {
	@FindBy(xpath="//mat-icon[text()=' local_shipping ']")
	WebElement trackOrder;
	
	@FindBy(id="navbarLogoutButton")
	WebElement logoutButton;
	
	public OrderHistoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}	

	public void trackingOrder()
	{
		trackOrder.click();
	}
	
	public void logout()
	{
		logoutButton.click();
	}
	
}
