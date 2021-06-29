/*@author= Mayur Adhude*/

package com.qa.qualitasGlobal.flipkart.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.base.TestBase;
import com.qa.qualitasGlobal.flipkart.pages.HomePage;
import com.qa.qualitasGlobal.flipkart.pages.PopUpLoginPage;

public class PopUpLoginPageTest extends TestBase {
	
	
	PopUpLoginPage popuploginpage;
	HomePage homePage;
	public PopUpLoginPageTest() 
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		
		initialization();
		Log.info("initialized the properties");
		
		popuploginpage = new PopUpLoginPage();
		Log.info("PopUpLoginPage Object Created");
	}
	
	@Test(priority=1)
	public void popUpLoginTest() 
	{  
	   Log.info("Getting the Username and Password ");
	   popuploginpage.popUpLogin(prop.getProperty("username"), prop.getProperty("password"));
	   Log.info("Login Successful ");
	   
	}
	public void popUPloginPageTitleTest() 
	{
		String title = popuploginpage.validatePopUpLoginPageTitle();
		Assert.assertEquals(title, "Online Shoping India|Buy Mobiles, Electronics, Appliances, Clothig and More Online at Flipkart.com");
	}
	 @AfterMethod(alwaysRun = true)
	public void tearDown() 
	{
    	if(driver!=null)
    	{
		driver.quit();
		Log.info("Closed the browser");
		Log.info("***********end*********");
    	}
	}

}
