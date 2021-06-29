/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.qualitasGlobal.flipkart.Helper.Log;
import com.qa.qualitasGlobal.flipkart.base.ObjectRepository;
import com.qa.qualitasGlobal.flipkart.base.TestBase;
import com.qa.qualitasGlobal.flipkart.pages.MyProfilePage;
public class Header extends TestBase {

	@FindBy(xpath=ObjectRepository.clikonflipkartimg)
	WebElement clikonflipkartimg;
	
//common search box	
	@FindBy(xpath = ObjectRepository.commonsearchbox)
	WebElement commonsearchbox;
    //search button on common search box	
	@FindBy(xpath = ObjectRepository.searchbutton)
	WebElement searchbutton;

//yourName
	@FindBy(xpath = ObjectRepository.yourname)
	WebElement yourname;
	// dropdown of yourName
	@FindBy(xpath = ObjectRepository.myprofile)
	WebElement myprofile;
	@FindBy(xpath = ObjectRepository.flipkartpluszone)
	WebElement flipkartpluszone;
	@FindBy(xpath = ObjectRepository.gamezone)
	WebElement gamezone;
	@FindBy(xpath = ObjectRepository.order)
	WebElement order;
	@FindBy(xpath = ObjectRepository.wishlist)
	WebElement wishlist;
	@FindBy(xpath = ObjectRepository.rewards)
	WebElement rewards;
	@FindBy(xpath = ObjectRepository.giftcards)
	WebElement giftcards;
	@FindBy(xpath = ObjectRepository.notifications)
	WebElement notifications;
	@FindBy(xpath = ObjectRepository.logout)
	WebElement logout;
//More
	@FindBy(xpath = ObjectRepository.more)
	WebElement more;
//Cart
	@FindBy(xpath = ObjectRepository.cart)
	WebElement cart;
	@FindBy(xpath = ObjectRepository.clickonaddtocart)
	WebElement clickonaddtocart;

	public Header() {
		PageFactory.initElements(driver, this);
		Log.info("initializing WebElements of subheader");
	}

	public HomePage clickOnFlipkartImg() 
	{
		clikonflipkartimg.click();
		return new HomePage();
	}
	public SearchPage commonSearchBox(String searchtext) {
		commonsearchbox.sendKeys(searchtext);
		return new SearchPage();
		
	}
	public SearchPage commonSearchBoxEnter() {
		
		commonsearchbox.sendKeys(Keys.RETURN);
		return new SearchPage();
	}


	public void searchButton() {
		searchbutton.click();
	}

	public void hoverYourName() {
		Actions actions = new Actions(driver);
		actions.moveToElement(yourname).build().perform();
	}

	public MyProfilePage clickOnMyProfile() {
		myprofile.click();
		return new MyProfilePage();
	}

	public void clickOnFlipkartPlusZone() {
		flipkartpluszone.click();
	}

	public void clickOnGameZone() {
		gamezone.click();
	}

	public void clickOnOrder() {
		order.click();
	}

	public void clickOnWishList() {
		wishlist.click();
	}

	public void clickOnRewards() {
		rewards.click();
	}

	public void clickOnGiftcards() {
		giftcards.click();
	}

	public void clickOnNotifications() {
		notifications.click();
	}

	public void clickOnLogout() {
		logout.click();
	}

	public void hovermore() {
		Actions actions = new Actions(driver);
		actions.moveToElement(more).build().perform();
	}

	public ViewCart clickOnCart() {
		cart.click();
		return new ViewCart();
	}
	
	public ViewCart clickOnAddToCart() 
	{
		clickonaddtocart.click();
		return new ViewCart();
		
	}

}
