package com.opencart.stepdefinitions;

import java.util.ArrayList;

import com.opencart.dataprovider.ExcelFileData;
import com.opencart.pageobject.TC_06_VerifyingOrderPlacementWithGuestCheckOut;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TC_06_OrderPlacingWithGuestCheckOut extends Base{
	
	TC_06_VerifyingOrderPlacementWithGuestCheckOut guest=new TC_06_VerifyingOrderPlacementWithGuestCheckOut();
	ExcelFileData excelFile=new ExcelFileData();
	
	@Given("^launch the opencart website using property file$")
	public void launch_the_opencart_website_using_property_file() throws Throwable {
		Base.browserInitialization();
	}

	@When("^mouseover on  Laptops and Notebooks and click on Show all laptops and Notebooks$")
	public void mouseover_on_Laptops_and_Notebooks_and_click_on_Show_all_laptops_and_Notebooks() throws Throwable {
		guest.mouseOverOnLaptopsAndNotebooks();
		guest.selectingallLaptops();
	}

	@When("^select hp laptop and click add to cart$")
	public void select_hp_laptop_and_click_add_to_cart() throws Throwable {
		guest.selectHPLaptop();
		guest.Addcart();
	}

	@When("^click Item basket button and click checkout button$")
	public void click_Item_basket_button_and_click_checkout_button() throws Throwable {
		guest.ItembasketAndCheckout();
		
	}

	@When("^Select GuestCheck out option and enter all the mandatory feilds$")
	public void select_GuestCheck_out_option_and_enter_all_the_mandatory_feilds() throws Throwable {
		guest.guestCheckOut();
	    
		ArrayList<String> testdata=excelFile.getData("user1");
		guest.fillingBillingdetails(testdata.get(1), testdata.get(2), testdata.get(3), testdata.get(4),
				testdata.get(5), testdata.get(6), testdata.get(7));
	}

	@When("^click terms and condition and place the order$")
	public void click_terms_and_condition_and_place_the_order() throws Throwable {
	    guest.deliveringMethod();
	    guest.cashOndelivery();
	    guest.confirm();
	}


	
	

}
