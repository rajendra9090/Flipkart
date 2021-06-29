
/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.qualitasGlobal.flipkart.base.TestBase;
import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.base.ObjectRepository;
import com.qa.qualitasGlobal.flipkart.pages.Header;
import com.qa.qualitasGlobal.flipkart.pages.HomePage;

import com.qa.qualitasGlobal.flipkart.pages.PopUpLoginPage;
import com.qa.qualitasGlobal.flipkart.pages.SubHeader;
import com.qa.qualitasGlobal.flipkart.pages.WomenClothingPage;

public class HomePageTest extends TestBase {

	PopUpLoginPage popuploginpage;
	HomePage homepage;
	WomenClothingPage clothingpage;
	SubHeader subheader;
	Header header;
	ObjectRepository myprofile;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		Log.info("initialized the properties");
		popuploginpage = new PopUpLoginPage();
		Log.info("LoginPopUpPage Object Created");
		homepage = new HomePage();
		clothingpage = new WomenClothingPage();
		Log.info("WomenClothingPage Object Created");
		header = new Header();
		Log.info("Header Object Created");
		subheader = new SubHeader();
		popuploginpage.popUpLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void varifyHomePageTitleTest() {
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title,"Online Shoping India|Buy Mobiles, Electronics, Appliances, Clothig and More Online at Flipkart.com");
	}

	@Test(priority = 2)
	public void goToWomenClothingTest() {
		subheader.hoverOnWomen();
		homepage.clickOnWomenClothing();
		Log.info("Clicked On Clothing ");

	}

	@Test(priority = 3)
	public void goToMyProfileTest() {
		header.hoverYourName();
		header.clickOnMyProfile();

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
			driver.close();
			Log.info("*****driver Closed****");

		}
	}

}
