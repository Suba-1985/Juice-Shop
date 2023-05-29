package com.Orange.HrmTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Orange.HrmBase.BaseClass;
import com.Orange.HrmPage.IndexPage;
import com.Orange.HrmPage.LoginPage;

public class LoginPageTest extends BaseClass{
     
	 IndexPage indexPage;
		 
	@Test(priority = 1)
		public void loginTest() throws InterruptedException
		{	 
		 indexPage=loginPage.loginMethod("Admin", "admin123");
      	 String actual=driver.getCurrentUrl();
		 System.out.println(actual);
		 String expected="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		 Assert.assertEquals(actual, expected);
		 System.out.println("hello");
		}
}
