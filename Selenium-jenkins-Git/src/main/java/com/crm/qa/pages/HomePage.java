package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement myname;
	
	@FindBy(xpath="//div[@id='main-nav']/a[3]")
	WebElement contactsLink;
	
	@FindBy(xpath="//div[@id='main-nav']/a[5]")
	WebElement dealsLink;
	
	
	
	
	
	
	//intializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getUserName() {
		return myname.getText();
	}
	
	public ContactsPage clickOnContacts() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	public DealsPage clickOnDeals() {
		dealsLink.click();
		return new DealsPage();
	}
	
	

}
