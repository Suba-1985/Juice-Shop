package com.Orange.HrmPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.HrmBase.BaseClass1;



public class LoginPage1 extends BaseClass1 {
	WebDriver driver;
 
 @FindBy(id="txtUsername") 
 WebElement userName;
 
 @FindBy(name="txtPassword") 
 WebElement password;
 
 @FindBy(xpath="//*[@id=\"btnLogin\"]") 
 WebElement loginBtn;
 
 @FindBy(xpath="//*[@id=\"divLogo\"]/img") 
 WebElement logo;
 
 public LoginPage1() {

PageFactory.initElements(driver, this);
 }
 
 public boolean validateLogo() {
  logo.isDisplayed();
  return true;
 }
 //This method will return object of HomePage class as we are landing on 
 //HomePage using this method
 public HomePage1 login(String uname, String pswd) {
  userName.sendKeys(uname);
  password.sendKeys(pswd);
  loginBtn.click();
  return new HomePage1();
 }
}
