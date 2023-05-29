package com.JuicyShop_NN;

import org.testng.annotations.Test;

import com.JuicyShop_NN_Base.BaseClass;
import com.JuicyShop_NN_Page.AddressCreatePage;
import com.JuicyShop_NN_Page.AddressSelectPage;
import com.JuicyShop_NN_Page.BasketPage;
import com.JuicyShop_NN_Page.DeliveryMethodPage;
import com.JuicyShop_NN_Page.LandingPage;
import com.JuicyShop_NN_Page.LoginPage;
import com.JuicyShop_NN_Page.SearchPage;

public class AddressSelectPageTest extends BaseClass {

	LandingPage landingPage;
	LoginPage loginPage;
	SearchPage searchPage;
	BasketPage basketPage;
	AddressSelectPage addressSelectPage;
	AddressCreatePage addressCreatePage;
	DeliveryMethodPage deliveryMethodPage;
	
	@Test
	public void addressSelect() throws InterruptedException
	{
		landingPage=new LandingPage(driver);	
		landingPage.accClick2Login();
		loginPage=new LoginPage(driver);
		searchPage=loginPage.loginEntry();
		searchPage=new SearchPage(driver);
		basketPage=new BasketPage(driver);
		basketPage=searchPage.addItem();		
		addressSelectPage=basketPage.itemsCheckOut();
		addressSelectPage=new AddressSelectPage(driver); 
		addressCreatePage=new AddressCreatePage(driver);
		addressCreatePage=addressSelectPage.newAddressClick();
		deliveryMethodPage=new DeliveryMethodPage(driver);
		deliveryMethodPage=addressSelectPage.addressSelection();
	}
	
	
}
