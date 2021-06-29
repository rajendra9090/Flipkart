/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.base.ObjectRepository;
import com.qa.qualitasGlobal.flipkart.base.TestBase;

public class PopUpLoginPage extends TestBase {
	
	
	@FindBy(xpath=ObjectRepository.username)
	WebElement username;
	
	@FindBy(xpath=ObjectRepository.password)
	WebElement password;
	
	@FindBy(xpath=ObjectRepository.loginbutton)
	WebElement loginbutton;
	
	@FindBy(xpath=ObjectRepository.forgot)
	WebElement forgot;
	
	@FindBy(xpath=ObjectRepository.signup)
	WebElement signup;
	
	@FindBy(xpath=ObjectRepository.popuploginlogo)
	WebElement popuploginlogo;
	
	public PopUpLoginPage() 
	{
		
		PageFactory.initElements(driver, this);
		Log.info("initializing WebElements of LoginPopUpPage");
	}
	
	
	
	public  HomePage popUpLogin(String un,String pwd) {
		
		username.sendKeys(un);
		Log.info("User Name typed");
		password.sendKeys(pwd);
		Log.info("Password is typed");
		loginbutton.click();
		Log.info("Clicked on Login Button of LoginPopUpPage ");
		Log.info("HomePage Object Returned");
		return new HomePage();
		
	}
	
	public String validatePopUpLoginPageTitle() 
	{
		return driver.getTitle();
	}

}
