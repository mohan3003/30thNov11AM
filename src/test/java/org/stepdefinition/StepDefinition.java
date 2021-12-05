package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.baseclass.PojoLogin;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass  {

	@Given("User should be in the login page")
	public void user_should_be_in_the_login_page() {
		launchBrowser();
		loadurl("https://www.facebook.com/");
	}

	@When("User should give the correct username")
	public void user_should_give_the_correct_username() throws IOException {
	    PojoLogin l=new PojoLogin();
		    sendValue(l.getUsername(), getData(1, 1, "Sheet1", "Book2"));
		    
	}

	@When("User should give the correct password")
	public void user_should_give_the_correct_password() throws IOException {
		PojoLogin l=new PojoLogin();
		 sendValue(l.getPswrd(), getData(2, 1, "Sheet1", "Book2"));
	}

	@Then("User should click the login button after entering the username and password")
	public void user_should_click_the_login_button_after_entering_the_username_and_password() {
		PojoLogin l=new PojoLogin();
		System.out.println("Login button has clicked");
	}
	@Then("User should click the login button")
	public void userShouldClickTheLoginButton() {
		System.out.println("Completed");
	    

}
}
