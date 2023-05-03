package com.opencart.stepdefinitions;

import java.util.List;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_13_VerifyingMissingFieldFucntionalityInCouponCode;
import com.opencart.utilities.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_13_MissingfFieldInApplyCouponCodeStepDefinitions extends Base{

	TC_13_VerifyingMissingFieldFucntionalityInCouponCode couponCode=new TC_13_VerifyingMissingFieldFucntionalityInCouponCode();
	LoginPageData data=new LoginPageData();
	
	@Given("^user is browser and entering the open cart url$")
    public void user_is_browser_and_entering_the_open_cart_url() throws Throwable {
		Base.browserInitialization();
    }

    @When("^user is clicking on account and enterning credentials$")
    public void user_is_clicking_on_account_and_enterning_credentials() throws Throwable {
    	couponCode.myAccount();
    	couponCode.userName(data.getNum());
    	couponCode.userPassword(data.getpass());
    	couponCode.loginButton();
    }

    @Then("^user is clicking on shoppingcart and clicking on applycoupon$")
    public void user_is_clicking_on_shoppingcart_and_clicking_on_applycoupon(DataTable arg) throws Throwable {
    	List<String>missingfiled=arg.asList(String.class);
    	couponCode.ShoppingCart(missingfiled.get(0));
    }

   

    @Then("^user able to see the error message  in the screen$")
    public void user_able_to_see_the_error_message_in_the_screen() throws Throwable {
    	couponCode.coupon();
       
    }

}
