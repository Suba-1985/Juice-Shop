package com.JuicyShop_NN_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class AddressCreatePage extends BaseClass{
	@FindBy(xpath="//*[@id=\"mat-input-1\"]")
	WebElement countryText;
	@FindBy(xpath="//*[@id=\"mat-input-2\"]")
	WebElement nameText;
	@FindBy(xpath="//*[@id=\"mat-input-3\"]")
	WebElement phoneText;
	@FindBy(xpath="//*[@id=\"mat-input-4\"]")
	WebElement zipcodeText;
	@FindBy(xpath="//*[@id=\"address\"]")
	WebElement addressText;
	@FindBy(xpath="//*[@id=\"mat-input-6\"]")
	WebElement cityText;
	@FindBy(xpath="//*[@id=\"mat-input-7\"]")
	WebElement stateText;
	@FindBy(xpath="//*[@id=\"submitButton\"]/span[1]")
	WebElement submitBtn;
	

	public AddressCreatePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	public AddressSelectPage randomEntry() throws InterruptedException
	{
//		Random randomGenerator = new Random();
//		int randomInt = randomGenerator. nextInt(1000);
//		countryText. sendKeys("country"+ randomInt);
//		Thread.sleep(1000);
		countryText.sendKeys("IU");
		nameText.sendKeys("sub");
		phoneText.sendKeys("3456789");
		zipcodeText.sendKeys("675432");
		addressText.sendKeys("dfsdf");
		cityText.sendKeys("va");
		stateText.sendKeys("sdf");
		Actions action=new Actions(driver);
		action.moveToElement(submitBtn).click().perform();
		
		return new AddressSelectPage(driver);
	}

}
