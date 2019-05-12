package com.nyco.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nyco.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//page factory
	
	@FindBy(xpath="//a[@class='header_nav' ]")
	WebElement HeaderMouseOver;
	
	@FindBy(xpath="//*[text()='LOG IN']")
	WebElement HeaderLoginBtn;
	
	
	@FindBy(id="atg_store_registerLoginEmailAddress")
	WebElement Email;
	
	@FindBy(id="atg_store_registerLoginPassword")
	WebElement password;
	
	@FindBy(id="atg_store_loginButton") 
	WebElement LoginBtn;
	
	@FindBy(xpath = "//*[contains ( text(),'Register Here')]")
	WebElement register;
	
	@FindBy(xpath = "//*[@title='NY&C']")
	WebElement Logo;
	
			
	//initializing the page objects
	
	
	public LoginPage(){
		
	PageFactory.initElements(driver, this);
	
	}
	
	//Actions
	
	public String validateLoginPageTile(){
		return driver.getTitle();
	}
	
	public boolean validateLogo(){
		return Logo.isDisplayed();
	}
	//public void preLoginAction(){
		
	//	Actions action = new Actions(driver) ;
	//	action.moveToElement(HeaderMouseOver).perform();
	//	action.click();
	//	action.perform();
		
	//	HeaderLoginBtn.click();
	//}
	
	public HomePage login(String un, String pw){
		Email.sendKeys(un);
		password.sendKeys(pw);
		LoginBtn.click();
		
		return new HomePage();
	
	}
	
}
