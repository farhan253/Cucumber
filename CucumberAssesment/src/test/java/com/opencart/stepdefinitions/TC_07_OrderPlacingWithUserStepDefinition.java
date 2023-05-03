package com.opencart.stepdefinitions;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_07_VerifyingOrderPlacementWithUser;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_07_OrderPlacingWithUserStepDefinition {
	
	TC_07_VerifyingOrderPlacementWithUser user=new TC_07_VerifyingOrderPlacementWithUser();
	LoginPageData excel=new LoginPageData();
	
	@Given("^user is going to open chrome and enters the open cart url$")
	public void user_is_going_to_open_chrome_and_enters_the_open_cart_url() throws Throwable {
		Base.browserInitialization();
	}

	@Then("^user is going to enter credentials$")
	public void user_is_going_to_enter_credentials() throws Throwable {
		user.myAccount();
		user.userName(excel.getNum());
		user.userPassword(excel.getpass());
		user.loginButton();
	}

	@Then("^user is moving  pointer to laptops and select all laptops in dropdown$")
	public void user_is_moving_pointer_to_laptops_and_select_all_laptops_in_dropdown() throws Throwable {
		user.mouseOverOnLaptopsAndNotebooks();
		user.selectingallLaptops();
	}

	@Then("^user is going to select hp laptop and add thelaptop to cart$")
	public void user_is_going_to_select_hp_laptop_and_add_thelaptop_to_cart() throws Throwable {
		user.selectHPLaptop();
		user.Addcart();
	}

	@Then("^user is going to clcik items basket and click on checkout$")
	public void user_is_going_to_clcik_items_basket_and_click_on_checkout() throws Throwable {
		user.ItembasketAndCheckout();
		user.deleteItem();
		
	}

	@Then("^user is going to click continue in billing details$")
	public void user_is_going_to_click_continue_in_billing_details() throws Throwable {
		user.BillingAddress();
	}

	@Then("^user is going to click continue on delivery details and delivery method$")
	public void user_is_going_to_click_continue_on_delivery_details_and_delivery_method() throws Throwable {
		user.deliverydetails();
		user.deliveriMethod();
	}

	@Then("^user is going to click continue on COD and confirm and capture screenshot$")
	public void user_is_going_to_click_continue_on_COD_and_confirm_and_capture_screenshot() throws Throwable {
		user.cashOnDelivery();
		user.confirm();
	}


}
