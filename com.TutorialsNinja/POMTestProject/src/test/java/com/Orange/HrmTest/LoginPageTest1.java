package com.Orange.HrmTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.HrmBase.BaseClass1;
import com.Orange.HrmPage.LoginPage;
import com.Orange.HrmPage.*;

	


	public class LoginPageTest1 extends BaseClass1 {
	 HomePage1 homePage;
	 
	 @Test(priority = 1)
	 public void logoTest() {
	  boolean flag=loginPage.validateLogo();
	  Assert.assertTrue(flag);
	 }
	 @Test(priority = 2)
	 public void loginTest() {
	  homePage=loginPage.login("admin", "admin123");
	  String expectedURL="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
	  String actualURL=BaseClass1.driver.getCurrentUrl();
	  Assert.assertEquals(actualURL, expectedURL);
	 }
	}

