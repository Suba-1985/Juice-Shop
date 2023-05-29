package com.Orange.HrmBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Orange.HrmPage.LoginPage;

public class BaseClass {
	public  static WebDriver driver;
    public LoginPage loginPage;
	
	
   @BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    loginPage = new LoginPage();
		
	}
	
//	@AfterMethod
//	public void tearDown() 
//	{	
//		driver.close();
//	}

}
