package com.TutorialsNinja;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TutorialsNinja_Project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Launching the web application");
		driver.findElement(By.xpath("//span[text()='Currency']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//button[@name='EUR']")).click();
		System.out.println("Currency changed to Euro");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("canon EOS 5 D");
		driver.findElement(By.xpath("//span[@class='input-group-btn']//button[@type='button']")).click();
		driver.findElement(By.linkText("Canon EOS 5D")).click();
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		if(driver.findElement(By.xpath("//div[@class=\"form-group required has-error\"]//div[@class='text-danger']")).isDisplayed())
		{
			System.out.println("(BUG)Error captured while ordering Camera");
			
		}else 
			System.out.println("Test Success");
		
		WebElement home=driver.findElement(By.xpath("//ul[@class='breadcrumb']//li//a//i[@class=\"fa fa-home\"]"));
		new Actions(driver).moveToElement(home).click().build().perform();		
		
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li//a[text()='Phones & PDAs']")).click();
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		
		WebElement qty= driver.findElement(By.xpath("//input[@name='quantity']"));
		qty.clear();
		qty.sendKeys("2");
		System.out.println("Ordering IPHONE");
		driver.findElement(By.xpath("//button[@id=\"button-cart\"]")).click();
		String expected="iPhone";
		String actual=driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]/a[1]")).getText();
		//System.out.println(actual);
		//System.out.println(expected);
	
		if(actual.equalsIgnoreCase(expected))
		{
			System.out.println("Printing the Success Message of adding iphone to the cart(Test Success)");
		}else
		{
			System.out.println("Test is failed");
		}
		driver.findElement(By.xpath("//span[@id=\"cart-total\"]//i[contains(@class,'fa fa-shopping-cart')]")).click();
		driver.findElement(By.xpath("//strong//i[@class='fa fa-shopping-cart']")).click();
		WebElement text=driver.findElement(By.xpath("//div[@class=\"input-group btn-block\"]//input[@class='form-control']"));
		text.clear();
		text.sendKeys("3");
		driver.findElement(By.xpath("//span//button[@class=\"btn btn-primary\"]")).click();
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		String actualerrormsg=driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText();
		String expectederrormsg="Products marked with *** are not available in the desired quantity or not in stock!";
		//System.out.println(actualerrormsg);
		if(expectederrormsg.contains(expectederrormsg))
		{
			System.out.println("Removed the item(iphone) from the cart");
			
		}
		else
			System.out.println("Failed");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//a[text()='Laptops & Notebooks']")).click();
		driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[1]/h4/a")).click();
        String qty1=driver.findElement(By.xpath("//div[@class='form-group']//input[@id='input-quantity' and @class='form-control']")).getAttribute("value");
        String qty2="1";
        if(qty1.contentEquals(qty2))
        {
        	//System.out.println(qty1);
        	driver.findElement(By.xpath("//div[@class='form-group']//button[text()='Add to Cart']")).click();
        }else 
        	System.out.println("No Stock of your Selected item");
        
        String actualmsg1=driver.findElement(By.xpath("//div[contains(@class,\"alert-success\")]")).getText();
        String expectedmsg1=" MacBook ";
        if(actualmsg1.contains(expectedmsg1))
        {
	        System.out.println("Macbook Added Successfully");
	    }else
	    {
	    	System.out.println("fail");
	   	}
driver.findElement(By.xpath("//span[text()=\"Shopping Cart\"]")).click();
driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a")).click();
driver.findElement(By.id("input-coupon")).sendKeys("ABCD123");
driver.findElement(By.xpath("//input[@id=\"button-coupon\"]")).click();
String amsg=driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText();
String  emsg="Warning";
if(amsg.contains(emsg))
{
	System.out.println("Coupon warning msg passed");
}
driver.findElement(By.id("input-coupon")).clear();
Thread.sleep(3000);
WebElement gift=driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]/div/h4//a[@class=\"accordion-toggle collapsed\"]"));
new Actions(driver).moveToElement(gift).build().perform();
gift.click();
driver.findElement(By.id("input-voucher")).sendKeys("AXDFGH123");
driver.findElement(By.id("button-voucher")).click();
String amsg1=driver.findElement(By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]")).getText();
String  emsg1="Warning";
if(amsg1.contains(emsg1))
{
	System.out.println("Gift warning msg passed");
}

driver.findElement(By.id("input-voucher")).clear();
driver.findElement(By.xpath("//div[@class=\"buttons clearfix\"]/div[2]/a[@class=\"btn btn-primary\"]")).click();
driver.findElement(By.xpath("//div[@class='radio']/label/input[@value='register']")).click();
driver.findElement(By.id("button-account")).click();
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='firstname' and @id='input-payment-firstname']")).sendKeys("Suba11");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='lastname' and @id='input-payment-lastname']")).sendKeys("Thi11");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='email' and @id='input-payment-email']")).sendKeys("SubashiniThiyagu111@gmail.com");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='telephone' and @id='input-payment-telephone']")).sendKeys("343434543");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='password' and @id='input-payment-password']")).sendKeys("password");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='confirm' and @id='input-payment-confirm']")).sendKeys("password");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='company' and @id='input-payment-company']")).sendKeys("NN company");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='address_1' and @id='input-payment-address-1']")).sendKeys("MG Street");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='city' and @id='input-payment-city']")).sendKeys("MG city");
driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='postcode' and @id='input-payment-postcode']")).sendKeys("34543546");
WebElement country=driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//select[@name='country_id']"));
WebElement state=driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//select[@name='zone_id']"));
Select countryelt=new Select(country);
countryelt.selectByVisibleText("United States");
Select stateelt=new Select(state);
stateelt.selectByVisibleText("Alabama");

driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='newsletter']")).click();

driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]//input[@name='agree']")).click();
driver.findElement(By.xpath("//input[@value='Continue' and @id='button-register']")).click();
String aerror=driver.findElement(By.xpath("//div[contains(@class,\"alert-danger\")]")).getText();
String eerror="already registered";
String eerror1="Warning";
if(aerror.contains(eerror) || aerror.contains(eerror)) {
	System.out.println("This Member is already registered");
	driver.findElement(By.xpath("//div[@class=\"panel panel-default\"]/div/h4/a[@data-toggle=\"collapse\" and @class=\"accordion-toggle collapsed\"]")).click();
	driver.findElement(By.id("input-email")).sendKeys("suba@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("password");
	driver.findElement(By.id("button-login")).click();
	driver.findElement(By.xpath("//div[@class=\"panel-group\"]/div[2]/div/h4/a[contains(@class,'accordion-toggle')]")).click();
	driver.findElement(By.xpath("//form[@class='form-horizontal']//input[@name='payment_address' and @value='existing']")).click();
	driver.findElement(By.xpath("//input[@id='button-payment-address' and @value='Continue']")).click();
	
	String warning=driver.findElement(By.xpath("//div[contains(@class,\"alert-warning\")]")).getText();
	String ewarning="Payment";
	System.out.println(warning);
	if(warning.contains(ewarning))
	{
		System.out.println("No Payment options is Mentioned error(Test Passed)");
	}

	driver.findElement(By.xpath("//a[text()=\"Contact Us\"]")).click();
	driver.findElement(By.xpath("//textarea[@name=\"enquiry\"]")).sendKeys("Enquiry submitted");
	driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
	driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	System.out.println("Enquiry submitted");
	
}
else {System.out.println("");
	String warning=driver.findElement(By.xpath("//div[contains(@class,\"alert-warning\")]")).getText();
	String ewarning="No Payment";
	System.out.println(warning);
	if(warning.contains(ewarning))
	{
		System.out.println("No Payment options");
	}}



driver.findElement(By.xpath("//a[text()=\"Contact Us\"]")).click();
driver.findElement(By.xpath("//textarea[@name=\"enquiry\"]")).sendKeys("Enquiry submitted");
driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
System.out.println("Enquiry submitted");
driver.quit();
}


		
	
		
		
		

	}


