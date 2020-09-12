package com.crm.qa.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;


// Sai immadi -- Author
public class ContactsPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		contactsPage = new ContactsPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.clickOnContacts();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(driver.getCurrentUrl());
	}

	
	
	@Test
	public void verifyPageName() {
		
		String pageName= contactsPage.verifyPageNameContacts();
		Assert.assertEquals(pageName, "Contacts", "Page name not matched!!!");
	}
	
	@Test
	public void verifyContactName() {
		
		String name= contactsPage.verifyFirstContact();
		Assert.assertEquals(name, "king india immadi", "name not matched!!!");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
