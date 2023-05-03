package com.opencart.stepdefinitions;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_03_VerifyingLoginFunctionalityInOpenCart;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_03_UserLoginFunctionalityStepDefinition extends Base{
	
	TC_03_VerifyingLoginFunctionalityInOpenCart login=new TC_03_VerifyingLoginFunctionalityInOpenCart();
	LoginPageData data=new LoginPageData();
	
	 @Given("^User should open chrome and enter URL$")
	    public void user_should_open_chrome_and_enter_url() throws Throwable {
		 Base.browserInitialization();
	    }

	    @When("^user is going to click and Select Login$")
	    public void user_is_going_to_click_and_select_login() throws Throwable {
	        login.myAccount();
	    }

	    @Then("^User should able to see Login page$")
	    public void user_should_able_to_see_Login_page() throws Throwable {
	        login.verifyLoginHomePage();
	    }

	    @Then("^User going to enter UserEmailId$")
	    public void user_going_to_enter_useremailid() throws Throwable {
	    	
	        login.userName(data.getNum());
	    }

	    @Then("^User going to enter UserPassword$")
	    public void user_going_to_enter_userpassword() throws Throwable {
	        login.userPassword(data.getpass());
	    }

	    @Then("^User going to click on Login button$")
	    public void user_going_to_click_on_login_button() throws Throwable {
	        login.loginButton();
	    }

	    @Then("^User should able to see Logout after succesfull login$")
	    public void user_should_able_to_see_logout_after_succesfull_login() throws Throwable {
	       login.verifyingHomePage();
	    }


}
