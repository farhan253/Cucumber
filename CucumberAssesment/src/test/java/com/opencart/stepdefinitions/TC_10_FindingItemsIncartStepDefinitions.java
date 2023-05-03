package com.opencart.stepdefinitions;

import java.util.List;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_10_VerifyingItemsInCart;
import com.opencart.utilities.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_10_FindingItemsIncartStepDefinitions extends Base{
	
	TC_10_VerifyingItemsInCart item=new TC_10_VerifyingItemsInCart();
	LoginPageData data=new LoginPageData();
	
	
	@Given("^user opens chrome and enters opencart url$")
	public void user_opens_chrome_and_enters_opencart_url() throws Throwable {
		Base.browserInitialization();
	    
	}

	@When("^user click on account and clicks on login$")
	public void user_click_on_account_and_clicks_on_login() throws Throwable {
	    item.myAccount();
	}

	@Then("^user should enter usedid and password$")
	public void user_should_enter_usedid_and_password() throws Throwable {
	   item.userName(data.getNum());
	   item.userPassword(data.getpass());
	  item.loginButton();
	}

	@Then("^user should search iphone$")
	public void user_should_search_iphone(DataTable arg1) throws Throwable {
		List<String>search=arg1.asList(String.class);
	  item.SearchItem(search.get(0));
	}

	@Then("^user should select iphone$")
	public void user_should_select_iphone(DataTable arg2) throws Throwable {
		List<String>quantity=arg2.asList(String.class);
		item.selectIphone(quantity.get(0));
	}


	@Then("^user should click add cart$")
	public void user_should_click_add_cart() throws Throwable {
	    item.addCart();
	}

	@Then("^uer should clickitemscart$")
	public void uer_should_clickitemscart() throws Throwable {
	    item.itemsCart();
	}

	@Then("^user should click on checkout$")
	public void user_should_click_on_checkout() throws Throwable {
	    item.checkout();
	}

}
