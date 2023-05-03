package com.opencart.stepdefinitions;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_11_VerifyingUserIsAbleToRemoveItemsInCart;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_11_DeletingItemsInCartStepDefinitions extends Base {
	
	TC_11_VerifyingUserIsAbleToRemoveItemsInCart remove=new TC_11_VerifyingUserIsAbleToRemoveItemsInCart();
	LoginPageData data=new LoginPageData();
	 @Given("^user opens chrome and user enters open cart url$")
	    public void user_opens_chrome_and_user_enters_open_cart_url() throws Throwable {
		 Base.browserInitialization();
	    }

	    @When("^user is going to click on my account$")
	    public void user_is_going_to_click_on_my_account() throws Throwable {
	    	remove.myAccount();
	    }

	    @Then("^user is going to enter input user and password$")
	    public void user_is_going_to_enter_input_user_and_password() throws Throwable {
	    	remove.userName(data.getNum());
	        remove.userPassword(data.getpass());
	        remove.loginButton();
	    }

	    @Then("^user going to mouseover on laptop and select laptop$")
	    public void user_going_to_mouseover_on_laptop_and_select_laptop() throws Throwable {
	        remove.mouseOverOnLaptopsAndNotebooks();
	        remove.selectingallLaptops();
	    }

	    @Then("^user going to select hp laptop and add it to cart$")
	    public void user_going_to_select_hp_laptop_and_add_it_to_cart() throws Throwable {
	        remove.selectHPLaptop();
	        
	    }

	    @Then("^user going to click ki shopping cart$")
	    public void user_going_to_click_ki_shopping_cart() throws Throwable {
	        remove.clickOnShoppingCart();
	    }

	    @Then("^user should able to delete the item and click on continue$")
	    public void user_should_able_to_delete_the_item_and_click_on_continue() throws Throwable {
	        remove.clickOnRemoveItems();
	        
	    }


}
