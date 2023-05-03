package com.opencart.stepdefinitions;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_05_VerifyingAddingItemsToCart;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_05_AddingItemInCartStepDefinitions {
	
	TC_05_VerifyingAddingItemsToCart cart=new TC_05_VerifyingAddingItemsToCart();
	LoginPageData data=new LoginPageData();
	
	 @Given("^User should open chromebrowser and able to enter open cart URL$")
	    public void user_should_open_chromebrowser_and_able_to_enter_open_cart_url() throws Throwable {
		 
		 Base.browserInitialization();
	    }

	    @Then("^User should able to  click on my account link and select Login link$")
	    public void user_should_able_to_click_on_my_account_link_and_select_login_link() throws Throwable {
	    	
	    	cart.myAccount();
	        
	    }

	    @Then("^User should enter UserID and password with excel data$")
	    public void user_should_enter_UserID_and_password_with_excel_data() throws Throwable {
	        cart.userName(data.getNum());
	        cart.userPassword(data.getpass());
	    }

	    @Then("^User should click on Login button$")
	    public void user_should_click_on_Login_button() throws Throwable {
	       cart.loginButton();
	    }

	    @Then("^User should able to mouse over the element on desktop dropdown TAB$")
	    public void user_should_able_to_mouse_over_the_element_on_desktop_dropdown_tab() throws Throwable {
	       
	    	cart.mouseOverOnDesktop();
	    }

	    @Then("^User should click Mac$")
	    public void user_should_click_mac() throws Throwable {
	        
	    	cart.clickOnMac();
	    }

	    @Then("^User should able to add the item into cart$")
	    public void user_should_able_to_add_the_item_into_cart() throws Throwable {
	        
	    	cart.addTocart();
	    	cart.addedSuccesfullymessage();
	    }

}
