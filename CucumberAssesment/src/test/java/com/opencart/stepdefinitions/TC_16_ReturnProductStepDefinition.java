package com.opencart.stepdefinitions;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_16_VerifyingProductReturnFunctionality;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_16_ReturnProductStepDefinition extends Base{
	
	TC_16_VerifyingProductReturnFunctionality Return=new TC_16_VerifyingProductReturnFunctionality();
	LoginPageData data=new LoginPageData();
	
	@Given("^user is opening browser and entering open cart url$")
	public void user_is_opening_browser_and_entering_open_cart_url() throws Throwable {
		Base.browserInitialization();
	}

	@When("^user going to click account and login credentials$")
	public void user_going_to_click_account_and_login_credentials() throws Throwable {
		Return.myAccount();
		Return.userName(data.getNum());
		Return.userPassword(data.getpass());
		Return.loginButton();
	}

	@Then("^in opencart homepage user going to click order history$")
	public void in_opencart_homepage_user_going_to_click_order_history() throws Throwable {
		Return.gotoOrderHistory();
	}

	@Then("^user is going to click on view item and return the item$")
	public void user_is_going_to_click_on_view_item_and_return_the_item() throws Throwable {
		Return.clickonViewAndReturn();
	}

	@Then("^user is going to fill the fileds and click on retrurn and continue to homepage$")
	public void user_is_going_to_fill_the_fileds_and_click_on_retrurn_and_continue_to_homepage() throws Throwable {
		Return.fields();
	}


}
