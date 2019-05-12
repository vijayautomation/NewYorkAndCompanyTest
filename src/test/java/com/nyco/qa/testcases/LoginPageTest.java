package com.nyco.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nyco.pages.LoginPage;
import com.nyco.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage LoginPage ;
	
	
	public LoginPageTest(){
		super();
	}
		
	@BeforeMethod
	
	public void setUp(){
		initialization();
		 LoginPage = new LoginPage();
		
	}
	
	@Test(priority =1)
	
	public void validateLoingPageTilte(){
	String title =LoginPage.validateLoginPageTile();
	
	Assert.assertEquals(title , "Sign In - New York & Company");
	}
	
	@Test(priority =2)
	
	public void nycoLogotest(){
	boolean flag = LoginPage.validateLogo();
	Assert.assertTrue(flag);
	}
	
	@Test(priority =3)
	
   public void loginTest(){
	LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
				
	}
		
	@AfterMethod
	
	public void tearDown(){
		driver.quit();
	}
	
			
}
