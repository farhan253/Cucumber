package com.opencart.stepdefinitions;

import java.util.ArrayList;
import com.opencart.dataprovider.ExcelFileData;
import com.opencart.pageobject.TC_02_VerifyingUserRegistrationFailureFunctionality;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_02_UserRegistrationFailureStepDefinitions extends Base {
	
	TC_02_VerifyingUserRegistrationFailureFunctionality user1;
	ExcelFileData excelFile=new ExcelFileData();
	
	 @Given("^User is opening chrome browser and user entering url$")
	    public void user_is_opening_chrome_browser_and_user_entering_url() throws Throwable {
		 Base.browserInitialization();
	    }

	    @When("^User is going to Click MyAccount and user is Selecting RegisterLink$")
	    public void user_is_going_to_click_myaccount_and_user_is_selecting_registerlink() throws Throwable {
	    	user1=new TC_02_VerifyingUserRegistrationFailureFunctionality();
	    	user1.myAccount();
	    }

	    @Then("^User should able to see Register Account Page succesfully$")
	    public void user_should_able_to_see_register_account_page_succesfully() throws Throwable {
	    	user1=new TC_02_VerifyingUserRegistrationFailureFunctionality();
	    	user1.verifyRegisterAccountPage();
	    }

	    @Then("^User is going to enter FirstName and the LastName$")
	    public void user_is_going_to_enter_firstname_and_the_lastname() throws Throwable {
	    	ArrayList<String> testdata=excelFile.getData("Invalid");
	    	user1.firstNameAndLastName(testdata.get(1), testdata.get(2));
	    }

	    @Then("^User should enter Email and Telephone$")
	    public void user_should_enter_email_and_telephone() throws Throwable {
	    	ArrayList<String> testdata=excelFile.getData("Invalid");
	    	user1.emailAndTelephone(testdata.get(3), testdata.get(4));
	    }

	    @Then("^User should enter Password and ConfrimPassword$")
	    public void user_should_enter_password_and_confrimpassword() throws Throwable {
	    	ArrayList<String> testdata=excelFile.getData("Invalid");
	    	user1.passwordAndConfrimPassword(testdata.get(5), testdata.get(6));
	    }

	    @Then("^User should click aggrement checkbox$")
	    public void user_should_click_aggrement_checkbox() throws Throwable {
	    	user1=new TC_02_VerifyingUserRegistrationFailureFunctionality();
	    	user1.clickCheckBox();
	    }

	    @Then("^User should click  continue$")
	    public void user_should_click_continue() throws Throwable {
	    	user1=new TC_02_VerifyingUserRegistrationFailureFunctionality();
	    	user1.submit();
	    	
	    }

	    @Then("^User Should able to see error on telephone textbox$")
	    public void user_should_able_to_see_error_on_telephone_textbox() throws Throwable {
	    	user1=new TC_02_VerifyingUserRegistrationFailureFunctionality();
	    	user1.verifyingTelephonefeild();
	    }

}
