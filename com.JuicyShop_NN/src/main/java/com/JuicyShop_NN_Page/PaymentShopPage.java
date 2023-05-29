package com.JuicyShop_NN_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.JuicyShop_NN_Base.BaseClass;

public class PaymentShopPage extends BaseClass{

	
	
	@FindBy(xpath="//mat-panel-title[text()=' Add new card ']")
	WebElement addCardEntry;
	@FindBy(xpath="//input[@id=\"mat-input-20\"]")
	WebElement nameField ;
	@FindBy(xpath="//*[@id=\"mat-input-14\"]")
	WebElement cardField;
	@FindBy(xpath="//*[@id=\"mat-input-15\"]")
	WebElement expMonth;
	@FindBy(xpath="//*[@id=\"mat-input-16\"]")
	WebElement expYear;
	@FindBy(xpath="//*[@id=\"mat-error-21\"]")
	WebElement cardErrMsg;
	@FindBy(xpath="//*[@id=\"mat-radio-46\"]/label")//*[@id="mat-radio-46"]/label/span[1]/span[1]
	WebElement cardSelect;
	@FindBy(xpath="//span[@class=\"mat-button-wrapper\"]//span[text()='Continue']")
	WebElement contnBtn;
	@FindBy(xpath="//*[@id=\"submitButton\"]/span[1]")
	WebElement submitBtn;
	
	public PaymentShopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public OrderSummaryPage addNewCardEntry()
	{
		addCardEntry.click();
		nameField.sendKeys("suba");
		cardField.sendKeys("1234567890");
		String errorMsg=cardErrMsg.getText();
		System.out.println(errorMsg);
		cardField.clear();
		cardField.sendKeys("1111111111111111");
		
		Select select=new Select(expMonth);
		select.selectByVisibleText("12");
		Select select1=new Select(expYear);
		select.selectByVisibleText("2085");
		submitBtn.click();
		cardSelect.click();
		contnBtn.click();
		return new OrderSummaryPage(driver);
		
		
		
		
				
	
		
	}

}
