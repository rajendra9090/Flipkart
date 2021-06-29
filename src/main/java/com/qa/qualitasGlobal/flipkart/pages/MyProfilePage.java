/*@author= Mayur Adhude*/
package com.qa.qualitasGlobal.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.qualitasGlobal.flipkart.base.ObjectRepository;
import com.qa.qualitasGlobal.flipkart.base.TestBase;

public class MyProfilePage extends TestBase {

	@FindBy(xpath = ObjectRepository.titleofmyprofilepage)
	WebElement titleofmyprofilepage;

	public MyProfilePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateMyProfilePageTitle() {
		return titleofmyprofilepage.isEnabled();
	}
}
