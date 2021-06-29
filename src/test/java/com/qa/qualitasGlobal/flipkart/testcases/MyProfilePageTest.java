/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.base.TestBase;
import com.qa.qualitasGlobal.flipkart.pages.Header;
import com.qa.qualitasGlobal.flipkart.pages.MyProfilePage;
import com.qa.qualitasGlobal.flipkart.pages.PopUpLoginPage;
import com.qa.qualitasGlobal.flipkart.pages.SubHeader;
import com.qa.qualitasGlobal.flipkart.pages.HomePage;

public class MyProfilePageTest extends TestBase{
	
	PopUpLoginPage popuploginpage;
	HomePage homepage;
	SubHeader subheader;
	Header header;
	MyProfilePage myprofilepage;
	
	
	public MyProfilePageTest() 
	{
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		Log.info("initialized the properties");
		popuploginpage = new PopUpLoginPage();
		Log.info("LoginPopUpPage Object Created");
		homepage = new HomePage();
		myprofilepage = new MyProfilePage();
		header = new Header();
		Log.info("Header Object Created");
		subheader = new SubHeader();
		Log.info("SubHeader Object Created");
		homepage = popuploginpage.popUpLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void varifyMyProfilePageTitleTest() 
	{
		header.hoverYourName();
		header.clickOnMyProfile();
		
		boolean title = myprofilepage.validateMyProfilePageTitle();
		//Assert.assertEquals(title, "My Profile", "Title Not Matched");
		Assert.assertEquals(title,true, "Title Not Matched");
		Log.info("Title Matched : My Profile");
		
		
	}
	
	
}
