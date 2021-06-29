/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.pages;

import java.util.ArrayList;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.Helper.WaitHelper;
import com.qa.qualitasGlobal.flipkart.base.ObjectRepository;
import com.qa.qualitasGlobal.flipkart.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = ObjectRepository.commonsearchbox)
	WebElement commonsearchbox;
	@FindBy(xpath = ObjectRepository.clothing)
	WebElement clothing;
	@FindBy(xpath = ObjectRepository.redminote6)
	WebElement redminote6;
	@FindBy(xpath = ObjectRepository.clickonaddtocart)
	WebElement clickonaddtocart;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
		Log.info("initializing WebElements of HomePage");
	}
	
	public void clickOnRedmi() 
	{
		String oldTab = driver.getWindowHandle();
		redminote6.click();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
		WaitHelper.waitForElementVisible(clickonaddtocart,35,6000);
	}

	

	public WomenClothingPage clickOnWomenClothing() {

		@SuppressWarnings("unused")
		boolean result = false;
		int attempts = 0;
		while (attempts < 2) {
			try {
				clothing.click();
				result = true;
				break;
			} catch (StaleElementReferenceException e) {

			}

		}
		 attempts++;
		return new WomenClothingPage();
	}
	
	public String validateHomePageTitle() 
	{
		return driver.getTitle();
	}

}








