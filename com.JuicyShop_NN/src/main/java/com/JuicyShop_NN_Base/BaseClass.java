package com.JuicyShop_NN_Base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.JuicyShop_NN_Page.LandingPage;

public class BaseClass {
	public static WebDriver driver;
	LandingPage landingPage;
	
	
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		ChromeOptions chromeOption=new ChromeOptions();
		chromeOption.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	//	chromeOption.setScriptTimeout(Duration.ofSeconds(10));
		chromeOption.addArguments("start-maximize");
		
		
		driver=new ChromeDriver(chromeOption);
		driver.get("https://juice-shop.herokuapp.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
		
		 landingPage=new LandingPage(driver);
		
		
	}
	
//	@AfterTest
//	public void tearDown()
//	{   driver.close();
//		driver.quit();
//	}

}
