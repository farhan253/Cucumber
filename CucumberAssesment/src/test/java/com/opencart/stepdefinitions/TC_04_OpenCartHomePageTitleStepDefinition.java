package com.opencart.stepdefinitions;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_04_VerifyingTheTitleOfOpenCartSite;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_04_OpenCartHomePageTitleStepDefinition {
	
	TC_04_VerifyingTheTitleOfOpenCartSite title=new TC_04_VerifyingTheTitleOfOpenCartSite();
	LoginPageData data=new LoginPageData();
	 @Given("^User should open chrome and enter open cart URL$")
	    public void user_should_open_chrome_and_enter_open_cart_url() throws Throwable {
		 Base.browserInitialization();
	    }

	    @Then("^User should click on my account link and select Login link$")
	    public void user_should_click_on_my_account_link_and_select_login_link() throws Throwable {
	       title.myAccount();
	    }

	    @Then("^User should enter UserID and password$")
	    public void user_should_enter_UserID_and_password() throws Throwable {
	       title.userName(data.getNum());
	       title.userPassword(data.getpass());
	    }

	    @Then("^user is able to verify the title of that opeancart homepage$")
	    public void user_is_able_to_verify_the_title_of_that_opeancart_homepage() throws Throwable {
	        title.verifyingTitle();
	    }


}
