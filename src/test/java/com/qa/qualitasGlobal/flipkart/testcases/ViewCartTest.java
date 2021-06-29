/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.base.TestBase;
import com.qa.qualitasGlobal.flipkart.pages.Header;
import com.qa.qualitasGlobal.flipkart.pages.HomePage;
import com.qa.qualitasGlobal.flipkart.pages.PopUpLoginPage;
import com.qa.qualitasGlobal.flipkart.pages.SubHeader;
import com.qa.qualitasGlobal.flipkart.pages.ViewCart;

public class ViewCartTest extends TestBase {
	
	PopUpLoginPage popuploginpage;
	HomePage homepage;
	SubHeader subheader;
	Header header;
	ViewCart viewcart;
	
	
	

	public ViewCartTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		Log.info("initialized the properties");
		popuploginpage = new PopUpLoginPage();
		Log.info("LoginPopUpPage Object Created");
		homepage = new HomePage();
		viewcart = new ViewCart();
		header = new Header();
		Log.info("Header Object Created");
		subheader = new SubHeader();
		homepage=popuploginpage.popUpLogin(prop.getProperty("username"), prop.getProperty("password"));

	}
	
	@Test(priority = 1)
	public void varifyAddToCartTest() {
		header.commonSearchBox("mobiles");
		header.commonSearchBoxEnter();
		homepage.clickOnRedmi();
		header.clickOnAddToCart();
		viewcart.ClickOnContinueShopping();
		
	}


	@AfterMethod()
	public void tearDown() {
		if (driver != null) {
			driver.close();
			Log.info("*****driver Closed****");

		}
	}
}
