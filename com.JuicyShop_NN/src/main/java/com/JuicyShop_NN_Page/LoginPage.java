package com.JuicyShop_NN_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.JuicyShop_NN_Base.BaseClass;

public class LoginPage extends BaseClass{
	//public WebDriver driver;

		
	@FindBy (id="email") WebElement uName;
	@FindBy (xpath="//input[@name=\"password\"]") WebElement pwdText;
	@FindBy (xpath="//button[@type='submit']") WebElement loginBtn;
	@FindBy (id = "rememberMe-input") WebElement chkBox;
	
	@FindBy (xpath="//div[@id=\"newCustomerLink\"]/a") WebElement notYetCustomerLink;

	public LoginPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public SearchPage loginEntry() throws InterruptedException
	{  
		
		System.out.println("Login enter page");
		uName.sendKeys("suba@numpyninja");
		pwdText.sendKeys("suba@numpyninja");
		Thread.sleep(3000);
		//chkBox.click();
		loginBtn.click();
		driver.getCurrentUrl();
		return new SearchPage(driver);
		
	}
	
	public RegisterPage notYetCustomerEntry()
	{   System.out.println("not yet customer method page");
	    driver.manage().window().setSize(new Dimension(1920, 1080));


		notYetCustomerLink.click();
		System.out.println("not yet customer method page2");
		return new RegisterPage(driver);
	}
	

}
