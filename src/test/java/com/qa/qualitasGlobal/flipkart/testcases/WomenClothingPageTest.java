/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.base.TestBase;
import com.qa.qualitasGlobal.flipkart.pages.PopUpLoginPage;

public class WomenClothingPageTest extends TestBase {
	
	 PopUpLoginPage popuploginpage;
	

	public WomenClothingPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp() 
	{
		Log.info("Initialization Process Begiun For WomenClothingPage");
		initialization();
		
		popuploginpage = new PopUpLoginPage();
		Log.info("LoginPopUpPage Object Created");
		popuploginpage.popUpLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		if(driver!=null) {
			driver.close();
		}
		
	}
}
