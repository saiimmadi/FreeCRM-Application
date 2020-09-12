package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="//span[@class='icon icon-xs mdi-chart-bar']")
	WebElement LogIn;
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement passwd;
	
	@FindBy(xpath="//div[@id='ui']/div//form/div/div[.='Login']")
	WebElement login;
	
	
	
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		
		public HomePage login(String user, String pass) {
			username.sendKeys(user);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			passwd.sendKeys(pass);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			login.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			return new HomePage();
		}
	
}
