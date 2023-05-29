package com.JuicyShop_NN_Page;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class RegisterPage extends BaseClass {
	
	
	@FindBy (xpath="//input[@id='emailControl']")
	WebElement emailID;
	@FindBy (xpath="//input[@id=\"passwordControl\"]") 
	WebElement passwordTxt;
	@FindBy (id = "repeatPasswordControl")
	WebElement confirmPassword;
	@FindBy (xpath="//span[@class='mat-slide-toggle-bar']/span")
	WebElement chkBox;
	@FindBy (xpath = "//div[@id='mat-select-value-1']/span")
	WebElement secQnBox;
	@FindBy (xpath = "//span[text()=' Name of your favorite pet? ']")
	WebElement secQn;
	@FindBy (id = "securityAnswerControl") 
	WebElement secQnAns;
    @FindBy (xpath="//*[@id=\"registerButton\"]")
    WebElement regBtn;
    
	public RegisterPage(WebDriver driver) {
			PageFactory.initElements(driver, this);		
	}
	
	
	public LoginPage regEntry() throws InterruptedException
	{  
		driver.manage().window().setSize(new Dimension(1920, 1080)); 
		driver.navigate().refresh();
		emailID.sendKeys("suba@numpyninja");		
		passwordTxt.sendKeys("suba@numpyninja");	
		confirmPassword.sendKeys("suba@numpyninja");
		Thread.sleep(500);
		chkBox.click();		
		chkBox.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", secQnBox);
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(secQnBox).click().perform();
		secQn.click();
		secQnAns.sendKeys("puppy");
		System.out.println(secQnAns.getText());
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", regBtn);
		Thread.sleep(1000);
		Actions act1=new Actions(driver);
		act1.moveToElement(regBtn).click().perform();
		System.out.println("RegEntry Done");	

		return new LoginPage(driver);
		
	}
}
