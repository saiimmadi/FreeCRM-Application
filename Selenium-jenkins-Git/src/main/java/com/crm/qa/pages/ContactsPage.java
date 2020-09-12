package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	@FindBy(xpath = "//div[@id='dashboard-toolbar']/div[1]")
	WebElement contactsLable;
	
	
	@FindBy(xpath="//td[contains(text(),'king')]")
	WebElement userlist;
	
	//intializing the Page Objects
		public ContactsPage() {
			PageFactory.initElements(driver, this);
		}
		
	
	public String verifyPageNameContacts()
	{
		return contactsLable.getText();
	}
	
	
	public String verifyFirstContact()
	{
		return userlist.getText();
	}
	
}
