package com.JuicyShop_NN_Page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.JuicyShop_NN_Base.BaseClass;

public class SearchPage extends BaseClass{
	
//	WebDriver driver;
	
	@FindBy(xpath="//div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button")
	WebElement appleJuice;
	@FindBy(xpath="//div[text()=' Carrot Juice (1000ml) ']/../../..//span[text()='Add to Basket']")
	WebElement carrotJuice;
	//@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]/span[1]")
	@FindBy(xpath="//div[text()=' OWASP Juice Shop CTF Girlie-Shirt ']/../../..//span[text()='Add to Basket']")
	WebElement girlShirt;
	
	@FindBy(xpath="//button[@aria-label='Next page']")
	WebElement pageSelectBtn;
	@FindBy(xpath="/html/body/div//div/a[@role='button']")
	WebElement box;
	@FindBy(xpath="/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[30]/div/mat-card/div[2]/button/span[2]")
	WebElement orangeJuice;
	@FindBy(xpath="//button[contains(@class,'mat-paginator-navigation-next mat-icon-button ')]")
	WebElement forwardBtn;
	@FindBy(xpath="//button[@class='mat-focus-indicator buttons mat-button mat-button-base ng-star-inserted']")
	WebElement shoppingCart;
	

	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    
	
	public BasketPage addItem() throws InterruptedException
	{    Actions act=new Actions(driver); 
		 box.click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
     	 js.executeScript("arguments[0].scrollIntoView();", pageSelectBtn);
         Thread.sleep(1000);
         System.out.println("Scrolled down..");  
         js.executeScript("window.scrollBy(0,-50)");   //Scroll Up (-ve)
         Thread.sleep(3000);
         System.out.println("Scrolled up..");         
         appleJuice.click();
         act.moveToElement(carrotJuice).click().perform();
         js.executeScript("arguments[0].scrollIntoView(true);",forwardBtn);//to scroll to the element
         
         act.moveToElement(forwardBtn).click().perform();
         //act.moveToElement(girlShirt).click().perform();
       
      girlShirt.click();
       //  carrotJuice.click();
         shoppingCart.click();
         return new BasketPage(driver);
         
         
        
//        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        
        
	
	}
}

//Actions act = new Actions(driver);
//act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
//System.out.println("Scroll down perfomedsearchpage");
//Thread.sleep(3000);
//
//act.sendKeys(Keys.PAGE_UP).build().perform();       //Page Up
//System.out.println("Scroll up perfomed");
//Thread.sleep(3000);	
//select=driver.findElements(By.xpath("//*[@id=\"mat-select-value-3\"]"));
//for(WebElement elt:select)
//{
//if(elt.getText().equals("36")) {
//	  System.out.println(elt.getText());
//	 elt.click();
//	 orangeJuice.click();
//	 System.out.println(elt);
//	 Thread.sleep(1000);
//}else if (elt.getText().equals("12"))
//{ System.out.println(elt.getText());
//	  elt.click();  
//	  appleJuice.click();
//	  System.out.println(elt);
//}else if(elt.getText().equals("24"))
//{   System.out.println(elt.getText());
//	  elt.click();
//	  hoodie.click();
//	  System.out.println("hoodie");
//}
//}
