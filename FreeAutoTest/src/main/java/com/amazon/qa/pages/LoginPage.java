package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.Testbase;

public class LoginPage extends Testbase {
	
	@FindBy(name="login")
	WebElement userName; 
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="commit")
	WebElement LoginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPage()
	{
		return driver.getTitle();
	}
	
	public void login(String un, String pwd)
	{
		userName.sendKeys(un);
		password.sendKeys(pwd);
		LoginBtn.click();
	}

}
