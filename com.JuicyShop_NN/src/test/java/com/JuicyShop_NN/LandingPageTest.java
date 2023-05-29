package com.JuicyShop_NN;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.JuicyShop_NN_Base.BaseClass;
import com.JuicyShop_NN_Page.LandingPage;
import com.JuicyShop_NN_Page.LoginPage;
import com.JuicyShop_NN_Page.RegisterPage;
import com.JuicyShop_NN_Page.SearchPage;

public class LandingPageTest extends BaseClass {
	
	LoginPage loginPage;
	LandingPage landingPage;
	
	
	@Test(priority=1)
	public void landingTest()
	{   
		landingPage=new LandingPage(driver);
		loginPage = landingPage.accClick2Login();
		System.out.println(loginPage);
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://juice-shop.herokuapp.com/#/login";
		//Assert.assertEquals(actualUrl, expectedUrl);		
		
	}

}
