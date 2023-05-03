package com.opencart.stepdefinitions;

import java.util.ArrayList;

import com.opencart.dataprovider.ExcelFileData;
import com.opencart.pageobject.TC_09_VerifyingUploadFileFunctionality;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_09_UploadFileStepDefinition extends Base{
	TC_09_VerifyingUploadFileFunctionality upload=new TC_09_VerifyingUploadFileFunctionality();
	ExcelFileData excel=new ExcelFileData();
	
	@Given("^launch the opencart website and by using property file$")
	public void launch_the_opencart_website_and_by_using_property_file() throws Throwable {
		Base.browserInitialization();
	}

	@When("^Mouseover on Components click monitors and select apple cinema (\\d+)$")
	public void mouseover_on_Components_click_monitors_and_select_apple_cinema(int arg1) throws Throwable {
		upload.mouseoverComponentTab();
		upload.clickOnAppleCinema30();
	}

	@Then("^able to enter all the required fields and upload file\\.$")
	public void able_to_enter_all_the_required_fields_and_upload_file() throws Throwable {
		ArrayList<String> testdata=excel.getData("user2");
		upload.enterfileds(testdata.get(1), testdata.get(2));
	}

	@Then("^click add to cart$")
	public void click_add_to_cart() throws Throwable {
		upload.addTocart();
	}

}
