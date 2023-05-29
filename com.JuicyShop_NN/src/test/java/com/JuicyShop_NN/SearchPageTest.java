package com.JuicyShop_NN;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.JuicyShop_NN_Base.BaseClass;
import com.JuicyShop_NN_Page.BasketPage;
import com.JuicyShop_NN_Page.LandingPage;
import com.JuicyShop_NN_Page.LoginPage;
import com.JuicyShop_NN_Page.SearchPage;

public class SearchPageTest extends BaseClass{
	
	LandingPage landingPage;
	LoginPage loginPage;
	SearchPage searchPage;
	BasketPage basketPage;
	@Test
	public void searchTest() throws InterruptedException
	{
	landingPage=new LandingPage(driver);	
	landingPage.accClick2Login();
	loginPage=new LoginPage(driver);
	searchPage=loginPage.loginEntry();
	searchPage=new SearchPage(driver);
	basketPage=new BasketPage(driver);
	basketPage=searchPage.addItem();

	}

}
