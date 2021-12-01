package org.stepdefinition;

import java.util.List;

import org.baseclass.BaseClass;
import org.baseclass.PojoLogin;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass  {

	@Given("User should be in the login page")
	public void user_should_be_in_the_login_page() {
	    launchBrowser();
	    driver.manage().window().maximize();
	    loadurl("https://www.facebook.com/");
	}

	@When("User should give the correct username")
	public void user_should_give_the_correct_username(io.cucumber.datatable.DataTable d) {
	    PojoLogin l=new PojoLogin();
	    List<List<String>> li = d.asLists();
	    String data = li.get(1).get(0);
	    sendValue(l.getUsername(), data);
	}

	@When("User should give the correct password")
	public void user_should_give_the_correct_password(io.cucumber.datatable.DataTable t) {
		PojoLogin l=new PojoLogin();
		List<List<String>> li = t.asLists();
	    String data = li.get(2).get(0);
		
		sendValue(l.getPswrd(), data);
		
	}

	@Then("User should click the login button after entering the username and password")
	public void user_should_click_the_login_button_after_entering_the_username_and_password() {
		PojoLogin l=new PojoLogin();
		System.out.println("Test passed");
	}


}
