package com.opencart.stepdefinitions;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_15_VerifyingWishListFunctionality;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_15_WishListStepDefinition {
	TC_15_VerifyingWishListFunctionality wishlist=new TC_15_VerifyingWishListFunctionality();
	LoginPageData data=new LoginPageData();
	
	
	
	@Given("^user going to open browser and entering url$")
	public void user_going_to_open_browser_and_entering_url() throws Throwable {
		Base.browserInitialization();
	}

	@When("^user is clicking on account and given login credentials$")
	public void user_is_clicking_on_account_and_given_login_credentials() throws Throwable {
		wishlist.myAccount();
		wishlist.userName(data.getNum());
		wishlist.userPassword(data.getpass());
		wishlist.loginButton();
	}

	@Then("^using is mouse overing to components and clicking monitor link$")
	public void using_is_mouse_overing_to_components_and_clicking_monitor_link() throws Throwable {
		wishlist.mouseOveringOnComponents();
	}

	@Then("^user is sorting the list to High to low and adding item to wishlist$")
	public void user_is_sorting_the_list_to_High_to_low_and_adding_item_to_wishlist() throws Throwable {
		wishlist.sortby();
	}

	@Then("^user should go to wihslist and check the item$")
	public void user_should_go_to_wihslist_and_check_the_item() throws Throwable {
		wishlist.checkwishlist();
	}

	@Then("^user should click the item to add to cart and should click shopping cart and should see the item in cart and capture screenshot$")
    public void user_should_click_the_item_to_add_to_cart_and_should_click_shopping_cart_and_should_see_the_item_in_cart_and_capture_screenshot() throws Throwable {
		wishlist.addCart();
    }
	

}
