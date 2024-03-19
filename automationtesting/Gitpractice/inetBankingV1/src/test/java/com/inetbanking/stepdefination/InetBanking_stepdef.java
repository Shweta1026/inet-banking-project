package com.inetbanking.stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.inetbanking.pageobjects.LoginPageObject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class InetBanking_stepdef extends SeleniumUtility{
	 WebDriver driver;
	LoginPageObject getLoginPageObject;
	
	@Given("browser is open and url {string} is entered")
	public void browser_is_open_and_url_is_entered(String url) {
	   driver=setUp("firefox",url);
	   getLoginPageObject=new LoginPageObject(driver);
	}

	@When("enter valid userid {string}")
	public void enter_valid_userid(String username) {
		getLoginPageObject.setUserName(username);
	}

	@And("enter valid password {string}")
	public void enter_valid_password(String password) {
		getLoginPageObject.setUserPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
		getLoginPageObject.clickOnLoginButton();
	}

	@Then("verify that we are navigated to homepage")
	public void verify_that_we_are_navigated_to_homepage() {
	   String expectedTitle="Guru99 Bank Manager HomePage";
	   String actualTitle=getCurrentTitleOfApplication();
	   System.out.println("expected title :"+expectedTitle);
	   System.out.println("actual title :"+actualTitle);
	   Assert.assertEquals(expectedTitle, actualTitle);
	}
	

@Then("close browser")
public void close_browser() {
    driver.close();
}


}
