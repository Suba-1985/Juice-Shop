package com.JuicyShop_NN;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.JuicyShop_NN_Base.BaseClass;
import com.JuicyShop_NN_Page.LandingPage;
import com.JuicyShop_NN_Page.LoginPage;
import com.JuicyShop_NN_Page.RegisterPage;

public class RegisterPageTest extends BaseClass {
	
	//public WebDriver driver;
	RegisterPage registerPage;
	LoginPage loginPage;
	 LandingPage landingPage;
	
	@Test
	public void registerTest() throws InterruptedException
	{
		 
			 landingPage=new LandingPage(driver);
		     landingPage.accClick2Login();
		     loginPage=new LoginPage(driver);
		     loginPage.notYetCustomerEntry();
			 registerPage=new RegisterPage(driver);
			
			loginPage=registerPage.regEntry();
			String actualUrl=driver.getCurrentUrl();
			String expectedUrl="https://juice-shop.herokuapp.com/#/login";
			//Assert.assertEquals(actualUrl, expectedUrl);
		
	} 
	
	

}
