package com.JuicyShop_NN_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class BasketPage extends BaseClass{
	
	@FindBy(xpath="//div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row[1]//button[2]")
	WebElement plusBtn1;
	@FindBy(xpath="//div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row[2]/mat-cell[3]/button[2]")
	WebElement plusBtn2;
	@FindBy(xpath="//*[@id=\"checkoutButton\"]/span[1]")
	WebElement chkOutBtn;
	
	public BasketPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public AddressSelectPage itemsCheckOut() throws InterruptedException
	{
		     
			Actions act=new Actions(driver);
			driver.navigate().refresh();
	        //Thread.sleep(2000);
	         act.doubleClick(plusBtn1).perform();
	         act.doubleClick(plusBtn2).perform();
	         chkOutBtn.click();
			 return new AddressSelectPage(driver);
	        
	}

}
