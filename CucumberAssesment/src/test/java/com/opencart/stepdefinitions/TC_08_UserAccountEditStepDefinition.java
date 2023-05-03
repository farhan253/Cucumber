package com.opencart.stepdefinitions;

import java.util.List;

import com.opencart.dataprovider.LoginPageData;
import com.opencart.pageobject.TC_08_VerifyingUserAbleToEditExistingAccount;
import com.opencart.utilities.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC_08_UserAccountEditStepDefinition extends Base {
	TC_08_VerifyingUserAbleToEditExistingAccount edit=new TC_08_VerifyingUserAbleToEditExistingAccount();
	LoginPageData data=new LoginPageData();
	
	@Given("^user opens chrome and enters open cart url$")
    public void user_opens_chrome_and_enters_open_cart_url() throws Throwable {
		Base.browserInitialization();
    }

    @When("^user is going to click my account$")
    public void user_is_going_to_click_my_account() throws Throwable {
        edit.myAccount();
    }

    @Then("^user is going to enter imput user and password$")
    public void user_is_going_to_enter_imput_user_and_password() throws Throwable {
        edit.userName(data.getNum());
        edit.userPassword(data.getpass());
        edit.loginButton();
    }

    @Then("^user is going to click editacoount link$")
    public void user_is_going_to_click_editacoount_link() throws Throwable {
        edit.selectEditAccount();
    }

    @Then("^user is going to update Lastname and clicking continue$")
    public void user_is_going_to_update_lastname_and_clicking_continue(DataTable last) throws Throwable {
    	List<String>editLastName=last.asList(String.class);
    	edit.editLastName(editLastName.get(0));    	 
    }

    @Then("^user should able to see account update success status$")
    public void user_should_able_to_see_account_update_success_status() throws Throwable {
       
    	edit.verifyingTheSuccessMsg();
    }
    @Then("^user should click on logout and continue to homepage$")
    public void user_should_click_on_logout_and_continue_to_homepage() throws Throwable {
        edit.logOut();
        edit.Continue();
    }


}
