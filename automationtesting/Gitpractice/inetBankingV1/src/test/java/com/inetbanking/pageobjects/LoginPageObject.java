package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class LoginPageObject extends SeleniumUtility {

	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "uid")
	private WebElement userName;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "btnLogin")
	private WebElement loginButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void setUserName(String uName) {
		userName.sendKeys(uName);
	}
	
	public void setUserPassword(String psw) {
		password.sendKeys(psw);
	}
	
	public void clickOnLoginButton() {
		clickOnElement(loginButton);
	}
}
