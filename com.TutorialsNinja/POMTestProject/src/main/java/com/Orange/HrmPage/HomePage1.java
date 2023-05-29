package com.Orange.HrmPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.HrmBase.BaseClass1;






	
	public class HomePage1 extends BaseClass1 {
	 
	 @FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	 WebElement adminTab;
	 
	 public HomePage1() {
	  PageFactory.initElements(driver, this);
	 }
	 //This method will return object of SystemUsersPage class as we are landing on 
	 //SystemUsersPage using this method
	 public SystemUsersPage clickOnAdminTab() {
	  adminTab.click();
	  return new SystemUsersPage();
	 }
	}

