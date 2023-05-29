package com.JuicyShop_NN;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.JuicyShop_NN_Base.BaseClass;
import com.JuicyShop_NN_Page.LandingPage;
import com.JuicyShop_NN_Page.LoginPage;
import com.JuicyShop_NN_Page.RegisterPage;
import com.JuicyShop_NN_Page.SearchPage;

public class LoginPageTest extends BaseClass {
	// WebDriver driver;
	SearchPage searchPage;
	RegisterPage registerPage;
	LoginPage loginPage;
	LandingPage landingPage;
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException	
	{ 
	    landingPage=new LandingPage(driver);
		landingPage.accClick2Login();
		loginPage=new LoginPage(driver);
		searchPage=loginPage.loginEntry();
		System.out.println(searchPage);
		System.out.println("Login test page executed");
		String actualUrl=driver.getTitle();
		
		System.out.println(actualUrl);
		String expectedUrl="OWASP Juice Shop"	;
        Assert.assertEquals(actualUrl, expectedUrl);
		System.out.println("Logintest excuteds");
		
	}
	@Test(priority=3)
	public void registerTest() throws InterruptedException
	{   landingPage=new LandingPage(driver);
    	landingPage.accClick2Login();

		loginPage=new LoginPage(driver);
		Thread.sleep(2000);
	    registerPage=loginPage.notYetCustomerEntry();
	    System.out.println("regider enter page");
	    String actualUrl=driver.getCurrentUrl();
	    System.out.println(actualUrl);
		String expectedUrl="https://juice-shop.herokuapp.com/#/register";
	//	Assert.assertEquals(actualUrl, expectedUrl);
		
	}

}
