package com.JuicyShop_NN;

import org.testng.annotations.Test;

import com.JuicyShop_NN_Base.BaseClass;
import com.JuicyShop_NN_Page.AddressSelectPage;
import com.JuicyShop_NN_Page.BasketPage;
import com.JuicyShop_NN_Page.LandingPage;
import com.JuicyShop_NN_Page.LoginPage;
import com.JuicyShop_NN_Page.SearchPage;

public class BasketPageTest extends BaseClass {
	
	LandingPage landingPage;
	LoginPage loginPage;
	SearchPage searchPage;
	BasketPage basketPage;
	AddressSelectPage addressSelectPage;
	
	@Test
	public void chkOutFunction() throws InterruptedException
	{
		landingPage=new LandingPage(driver);
		loginPage=new LoginPage(driver);
		loginPage=landingPage.accClick2Login();	
		searchPage=new SearchPage(driver);
		searchPage=loginPage.loginEntry();
		
		basketPage=new BasketPage(driver);
		basketPage=searchPage.addItem();		
		addressSelectPage=new AddressSelectPage(driver);
		addressSelectPage=basketPage.itemsCheckOut();
		
	}
	

}
