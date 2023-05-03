package com.opencart.stepdefinitions;

import java.util.List;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_14_VerifyingEstimateShippingTaxes;
import com.opencart.utilities.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TC_14_ShippingTaxStepDefinitions extends Base{
	
	TC_14_VerifyingEstimateShippingTaxes tax=new TC_14_VerifyingEstimateShippingTaxes();
	LoginPageData data= new LoginPageData();
	
	
	@Given("^User opening chrome and entering opencart url$")
    public void user_opening_chrome_and_entering_opencart_url() throws Throwable {
		Base.browserInitialization();
    }

    @Then("^user going to login page and entering details$")
    public void user_going_to_login_page_and_entering_details() throws Throwable {
        tax.myAccount();
        tax.userName(data.getNum());
        tax.userPassword(data.getpass());
        tax.loginButton();
    }

    @Then("^user clicking on shopping cart$")
    public void user_clicking_on_shopping_cart() throws Throwable {
        tax.shoppinCartAndViewCart();
    }

    @Then("^user going to click Estimate shipping & taxes and entering country,region and postal code$")
    public void user_going_to_click_estimate_shipping_taxes_and_entering_countryregion_and_postal_code(DataTable arg) throws Throwable {
    	List<String>postal=arg.asList(String.class);
        tax.EstimateShippingTaxes(postal.get(0));
    }

    @Then("^user click on getquote and click on  Flat Shipping Rte and click Apply shipping and  capture the successmessage$")
    public void user_click_on_getquote_and_click_on_flat_shipping_rte_and_click_apply_shipping_and_capture_the_successmessage() throws Throwable {
        tax.clickQuoteApplyshipping();
    }

    @Then("^user clicks on checkout button$")
    public void user_clicks_on_checkout_button() throws Throwable {
     tax.clickcheckOut();   
    }

    @Then("^user enters billing details and click on continue$")
    public void user_enters_billing_details_and_click_on_continue() throws Throwable {
        tax.billingdetails();
    }

    @Then("^user enters delivering details and click on continue$")
    public void user_enters_delivering_details_and_click_on_continue() throws Throwable {
        tax.deliveringdetails();
    }

    @Then("^user enters delivery method and clicks on continue$")
    public void user_enters_delivery_method_and_clicks_on_continue() throws Throwable {
     tax.deliverymethod();   
    }

    @Then("^user enters COD and tick the check box and clicks on continue$")
    public void user_enters_cod_and_tick_the_check_box_and_clicks_on_continue() throws Throwable {
       tax.paymentMethod();
    }

    @Then("^user enters Confirm order and clicks on confirm order$")
    public void user_enters_confirm_order_and_clicks_on_confirm_order() throws Throwable {
        tax.buttonconfirm();
    }


}
