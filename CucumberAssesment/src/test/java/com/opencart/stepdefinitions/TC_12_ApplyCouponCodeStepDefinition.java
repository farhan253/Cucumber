package com.opencart.stepdefinitions;

import java.util.List;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_12_verifyingApplyCouponCodeFunctionality;
import com.opencart.utilities.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_12_ApplyCouponCodeStepDefinition extends Base {
	
	TC_12_verifyingApplyCouponCodeFunctionality coupon=new TC_12_verifyingApplyCouponCodeFunctionality();
	LoginPageData data=new LoginPageData();
	
	@Given("^User is initializing the browser and entering the open cart url$")
    public void user_is_initializing_the_browser_and_entering_the_open_cart_url() throws Throwable {
		Base.browserInitialization();
    }

    @When("^user is going to click on account and enter login details$")
    public void user_is_going_to_click_on_account_and_enter_login_details() throws Throwable {
        coupon.myAccount();
        coupon.userName(data.getNum());
        coupon.userPassword(data.getpass());
        coupon.loginButton();
    }

    @Then("^user is going to mouseover and select the laptops$")
    public void user_is_going_to_mouseover_and_select_the_laptops() throws Throwable {
        coupon.mouseOverOnLaptopsAndNotebooks();
        coupon.selectingallLaptops();
    }

    @Then("^user is going to select the hp laptop$")
    public void user_is_going_to_select_the_hp_laptop() throws Throwable {
        coupon.selectHPlaptop();
    }

    @Then("^user going to enter date and quantity$")
    public void user_going_to_enter_date_and_quantity(DataTable arg1) throws Throwable {
       List<String>DateAndQuantity= arg1.asList(String.class);
       coupon.changeDate(DateAndQuantity.get(0), DateAndQuantity.get(1));
    }

    @Then("^user going to click add cart button and click shopping cart$")
    public void user_going_to_click_add_cart_button_and_click_shopping_cart() throws Throwable {
        coupon.addCart();
    }

    @Then("^user is going to apply coupon code$")
    public void user_is_going_to_apply_coupon_code(DataTable arg2) throws Throwable {
    	 List<String>Couponcode= arg2.asList(String.class);
    	 coupon.couponCode(Couponcode.get(0));
        
    }

}
