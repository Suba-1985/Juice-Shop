package com.JuicyShop_NN_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class OrderCompletionPage extends BaseClass{
@FindBy(xpath="//h1[@class=\"confirmation\"]")
WebElement thanksMsg;

@FindBy(id="navbarAccount")
WebElement act;

@FindBy(xpath="//button[@aria-label='Show Orders and Payment Menu']")
WebElement paymentMenu;

@FindBy(xpath="//span[text()=' Order History ']")
WebElement orderHistory;

public OrderCompletionPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String successMsg()
{
return thanksMsg.getText();
}

public OrderHistoryPage acctCheck()
{
	act.click();
	paymentMenu.click();
	orderHistory.click();
	return new OrderHistoryPage(driver);
}
}
