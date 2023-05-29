package com.JuicyShop_NN;

import org.testng.annotations.Test;

import com.JuicyShop_NN_Base.BaseClass;
import com.JuicyShop_NN_Page.AddressCreatePage;
import com.JuicyShop_NN_Page.AddressSelectPage;
import com.JuicyShop_NN_Page.BasketPage;
import com.JuicyShop_NN_Page.DeliveryMethodPage;
import com.JuicyShop_NN_Page.LandingPage;
import com.JuicyShop_NN_Page.LoginPage;
import com.JuicyShop_NN_Page.PaymentShopPage;
import com.JuicyShop_NN_Page.SearchPage;

public class DeliverymethodPageTest extends BaseClass {
	
	
	LandingPage landingPage;
	LoginPage loginPage;
	SearchPage searchPage;
	BasketPage basketPage;
	AddressSelectPage addressSelectPage;
	AddressCreatePage addressCreatePage;
	DeliveryMethodPage deliveryMethodPage;
	PaymentShopPage paymentShopPage;
	@Test
	public void deliver_Method() throws InterruptedException
	{
		landingPage=new LandingPage(driver);	
		landingPage.accClick2Login();
		loginPage=new LoginPage(driver);
		searchPage=loginPage.loginEntry();
		searchPage=new SearchPage(driver);
		basketPage=searchPage.addItem();
		basketPage=new BasketPage(driver);
		basketPage.itemsCheckOut();
		
		addressCreatePage=addressSelectPage.newAddressClick();
		addressSelectPage=new AddressSelectPage(driver); 
		
		addressSelectPage=addressCreatePage.randomEntry();
		addressCreatePage=new AddressCreatePage(driver);
		
		deliveryMethodPage=addressSelectPage.addressSelection();
		deliveryMethodPage=new DeliveryMethodPage(driver);
		
		paymentShopPage=deliveryMethodPage.deliveryMethodChoose();
	}

}
