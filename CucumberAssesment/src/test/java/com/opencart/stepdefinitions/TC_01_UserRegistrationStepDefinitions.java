package com.opencart.stepdefinitions;

import java.util.ArrayList;
import com.opencart.dataprovider.ExcelFileData;
import com.opencart.pageobject.TC_01_VerifyingUserRegistrationFunctionality;
import com.opencart.utilities.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_01_UserRegistrationStepDefinitions extends Base {
	
	TC_01_VerifyingUserRegistrationFunctionality user;
	ExcelFileData excelFile=new ExcelFileData();
	
	@Given("^User is opening chrome browser and entering url$")
    public void user_is_opening_chrome_browser_and_entering_url() throws Throwable {
       Base.browserInitialization();
    }

    @When("^User is going to Click MyAccount and Select RegisterLink$")
    public void user_is_going_to_click_myaccount_and_select_registerlink() throws Throwable {
        user=new TC_01_VerifyingUserRegistrationFunctionality();
        user.myAccount();
    	
    }

    @Then("^User should able to see Register Account Page$")
    public void user_should_able_to_see_register_account_page() throws Throwable {
    	user=new TC_01_VerifyingUserRegistrationFunctionality();
    	user.verifyRegisterAccountPage();
    }

    @Then("^User is going to enter FirstName and LastName$")
    public void user_is_going_to_enter_firstname_and_lastname() throws Throwable {
    	ArrayList<String> testdata=excelFile.getData("Valid");
    	user.firstNameAndLastName(testdata.get(1), testdata.get(2));
    }

    @Then("^User is going to enter Email and Telephone$")
    public void user_is_going_to_enter_email_and_telephone() throws Throwable {
    	ArrayList<String> testdata=excelFile.getData("Valid");
    	user.emailAndTelephone(testdata.get(3), testdata.get(4));
    }

    @Then("^User is going to enter Password and ConfrimPassword$")
    public void user_is_going_to_enter_password_and_confrimpassword() throws Throwable {
    	ArrayList<String> testdata=excelFile.getData("Valid");
    	user.passwordAndConfrimPassword(testdata.get(5), testdata.get(6));
    }

    @Then("^User should click checkbox for aggreement policy$")
    public void user_should_click_checkbox_for_aggreement_policy() throws Throwable {
    	 user=new TC_01_VerifyingUserRegistrationFunctionality();
    	 user.clickCheckBox();
    }

    @Then("^User should click on continue$")
    public void user_should_click_on_continue() throws Throwable {
    	user=new TC_01_VerifyingUserRegistrationFunctionality();
    	user.submit();
    	System.out.println("Account created Succesfully");
    	
    }

	
	
	



}
