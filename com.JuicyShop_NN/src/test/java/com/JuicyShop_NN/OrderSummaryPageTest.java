package com.JuicyShop_NN;

import org.testng.annotations.Test;

import com.JuicyShop_NN_Base.BaseClass;
import com.JuicyShop_NN_Page.AddressCreatePage;
import com.JuicyShop_NN_Page.AddressSelectPage;
import com.JuicyShop_NN_Page.BasketPage;
import com.JuicyShop_NN_Page.DeliveryMethodPage;
import com.JuicyShop_NN_Page.LandingPage;
import com.JuicyShop_NN_Page.LoginPage;
import com.JuicyShop_NN_Page.OrderCompletionPage;
import com.JuicyShop_NN_Page.OrderSummaryPage;
import com.JuicyShop_NN_Page.PaymentShopPage;
import com.JuicyShop_NN_Page.SearchPage;

public class OrderSummaryPageTest extends BaseClass{
	
	LandingPage landingPage;
	LoginPage loginPage;
	SearchPage searchPage;
	BasketPage basketPage;
	AddressSelectPage addressSelectPage;
	AddressCreatePage addressCreatePage;
	DeliveryMethodPage deliveryMethodPage;
	PaymentShopPage paymentShopPage;
	OrderSummaryPage orderSummaryPage;
	OrderCompletionPage orderCompletionPage;
	
	@Test
	public void orderSummary() throws InterruptedException
	{
		landingPage=new LandingPage(driver);	
		landingPage.accClick2Login();
		loginPage=new LoginPage(driver);
		searchPage=loginPage.loginEntry();
		searchPage=new SearchPage(driver);
		basketPage=new BasketPage(driver);
		basketPage=searchPage.addItem();
		addressSelectPage=new AddressSelectPage(driver);
		addressSelectPage=basketPage.itemsCheckOut();
		addressSelectPage=new AddressSelectPage(driver); 
	//	addressCreatePage=addressSelectPage.newAddressClick();
		
	//	addressSelectPage=addressCreatePage.randomEntry();
		addressCreatePage=new AddressCreatePage(driver);
		deliveryMethodPage=new DeliveryMethodPage(driver);
		deliveryMethodPage=addressSelectPage.addressSelection();
	
		paymentShopPage=new PaymentShopPage(driver);
		paymentShopPage=deliveryMethodPage.deliveryMethodChoose();	
		orderSummaryPage=new OrderSummaryPage(driver);
		orderSummaryPage=paymentShopPage.addNewCardEntry();
		orderCompletionPage=orderSummaryPage.placeOrder();
	}

}
