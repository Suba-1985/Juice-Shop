package com.JuicyShop_NN_Page;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class LandingPage extends BaseClass{
	
	
	@FindBy(xpath="//span[@class=\"mat-button-wrapper\"]/i")
	WebElement accountBtn;
	
	@FindBy(xpath="//button[@id=\"navbarLoginButton\"]")
	WebElement loginBtn;
	
	
	@FindBy(xpath="//button[contains(@class,'mat-button-base mat-primary')]")
	WebElement dismissBtn;
	
	@FindBy (xpath="//a[text()='Already a customer?']") WebElement alreadyCustomerBtn;
	
	@FindBy (xpath="//a[text()='Not yet a customer?']") WebElement notYetCustomerBtn;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



//	public RegisterPage accClick2Register()
//	{     
//		dismissBtn.click();
//		accountBtn.click();
//		loginBtn.click();
//		//notYetCustomerBtn.click();
//		return new RegisterPage(driver);
//	}
	
	public LoginPage accClick2Login()
	{     
		dismissBtn.click();
		//driver.manage().window().setSize(new Dimension(1920, 1080));
		accountBtn.click();
		loginBtn.click();
		System.out.println("successfullLogin");
		return new LoginPage(driver);
	}

}
