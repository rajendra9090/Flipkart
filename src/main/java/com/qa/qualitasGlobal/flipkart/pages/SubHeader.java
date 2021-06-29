/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.base.ObjectRepository;
import com.qa.qualitasGlobal.flipkart.base.TestBase;

public class SubHeader extends TestBase {

//Electronics	
	@FindBy(xpath = ObjectRepository.electronics)
	WebElement electronics;
//TVs & Appliances	
	@FindBy(xpath = ObjectRepository.tvsandappliances)
	WebElement tvsandappliances;
//Men	
	@FindBy(xpath = ObjectRepository.men)
	WebElement men;
//Women	
	@FindBy(xpath = ObjectRepository.women)
	WebElement women;
//Baby & Kids	
	@FindBy(xpath = ObjectRepository.babyandkids)
	WebElement babyandkids;
//Home & Furniture	
	@FindBy(xpath = ObjectRepository.homeandfurniture)
	WebElement homeandfurniture;
//sports, books & More	
	@FindBy(xpath = ObjectRepository.sportsbooksandMore)
	WebElement sportsbooksandMore;
//Offer Zone	
	@FindBy(xpath = ObjectRepository.offerzone)
	WebElement offerzone;

	// constructor
	public SubHeader() {
		PageFactory.initElements(driver, this);
		Log.info("initializing WebElements of subheader");
	}

	public void hoverOnElectronics() {
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).build().perform();
	}

	public void hoverOnTvsAndAppliances() {
		Actions actions = new Actions(driver);
		actions.moveToElement(tvsandappliances).build().perform();
	}

	public void hoverOnMen() {
		Actions actions = new Actions(driver);
		actions.moveToElement(men).build().perform();
	}

	public void hoverOnWomen() {

		// search.sendKeys("ABCDEFG");
		// WebDriverWait wait = new WebDriverWait(driver,20);
		// wait.until(ExpectedConditions.visibilityOf(women));
		Actions actions = new Actions(driver);
		actions.moveToElement(women).build().perform();
		// return actions;

	}

	public void hoverOnBabyAndKids() {
		Actions actions = new Actions(driver);
		actions.moveToElement(babyandkids).build().perform();
	}

	public void hoverOnHomeAndFurniture() {
		Actions actions = new Actions(driver);
		actions.moveToElement(homeandfurniture).build().perform();
	}

	public void hoverOnSportsBooksAndMore() {
		Actions actions = new Actions(driver);
		actions.moveToElement(sportsbooksandMore).build().perform();
	}

	public void clickOnOfferZone() {
		
		offerzone.click();
	}

}
