package com.Orange.HrmBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Orange.HrmPage.LoginPage1;


/**
 * @author Hitendra
 *  
 */

public class BaseClass1 {
	
	
	 public static WebDriver driver;
	 public LoginPage1 loginPage;
	 
	 @BeforeMethod
	 public void setup() {
	  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\ChromeDriver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	  loginPage=new LoginPage1();
	 }
	 @AfterMethod
	 public void tearDown() {
	  driver.close();
	 }
	}

