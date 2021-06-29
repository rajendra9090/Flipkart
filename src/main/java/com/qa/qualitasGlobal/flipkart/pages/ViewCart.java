package com.qa.qualitasGlobal.flipkart.pages;

/*@author= Mayur Adhude*/

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.qualitasGlobal.flipkart.base.ObjectRepository;
import com.qa.qualitasGlobal.flipkart.base.TestBase;

public class ViewCart extends TestBase {

	@FindBy(xpath = ObjectRepository.cart)
	WebElement cart;

	@FindBy(xpath = ObjectRepository.placeorder_btn)
	WebElement placeorder_btn;

	@FindBy(xpath = ObjectRepository.continueshopping_btn)
	WebElement continueshopping_btn;

	@FindBy(xpath = ObjectRepository.saveforlater1)
	WebElement saveforlater1;
	@FindBy(xpath = ObjectRepository.saveforlater2)
	WebElement saveforlater2;
	@FindBy(xpath = ObjectRepository.saveforlater3)
	WebElement saveforlater3;
	@FindBy(xpath = ObjectRepository.saveforlater4)
	WebElement saveforlater4;
	@FindBy(xpath = ObjectRepository.saveforlater5)
	WebElement saveforlater5;

	
	@FindBy(xpath = ObjectRepository.remove1)
	WebElement remove1;
	@FindBy(xpath = ObjectRepository.remove2)
	WebElement remove2;
	@FindBy(xpath = ObjectRepository.remove3)
	WebElement remove3;
	@FindBy(xpath = ObjectRepository.remove4)
	WebElement remove4;
	@FindBy(xpath = ObjectRepository.remove5)
	WebElement remove5;
	

	

	// Registering WebElement
	public ViewCart() {

		PageFactory.initElements(driver, this);
	}

	
	
	// Click on Cart
	public ViewCart clickOnCart() {
		cart.click();
		return new ViewCart();
	}

	// Click On Place Order
	public void ClickOnContinueShopping() {
		continueshopping_btn.click();
		//return new CartContinueShoppingPage();
	}

	// Click On Continue Shopping
	public CheckOutPage clickOnPlaceOrder() {
		placeorder_btn.click();
		return new CheckOutPage();
	}

	public void clickOnSaveForLater(WebElement saveforlater_n) 
	{
		
		saveforlater_n.click();
	}
	
	public void clickOnRemove(WebElement remove_n) 
	{
		
		remove_n.click();
	}
}
