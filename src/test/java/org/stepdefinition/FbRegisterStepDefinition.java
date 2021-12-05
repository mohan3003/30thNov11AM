package org.stepdefinition;

import cucumber.api.java.en.*;

public class FbRegisterStepDefinition {
	
	@Given("User should launch the browser and load url")
	public void userShouldLaunchTheBrowserAndLoadUrl() {
	    System.out.println("Browser launched");
	}

	@When("User should click the create new account button to create a account")
	public void userShouldClickTheCreateNewAccountButtonToCreateAAccount() {
		 System.out.println("Button has clicked");
	}

	@When("User should give First name and lastname")
	public void userShouldGiveFirstNameAndLastname() {
		System.out.println("Names has been given");
	}

	@When("User should give Either mobile number or Email id")
	public void userShouldGiveEitherMobileNumberOrEmailId() {
		System.out.println("Mobile number has been given");
	}

	@When("User should give proper password")
	public void userShouldGiveProperPassword() {
		System.out.println("Password has also given");
	}

	@When("User should click the signup button")
	public void userShouldClickTheSignupButton() {
		System.out.println("Button has clicked");
	}

	@Then("If all the given details are satisfied the requirements means account will create")
	public void ifAllTheGivenDetailsAreSatisfiedTheRequirementsMeansAccountWillCreate() {
		System.out.println("Accout has created");
	}

	@When("User should click the Terms and condition")
	public void userShouldClickTheTermsAndCondition() {
		System.out.println("Terms and condition link has clicked");
	}



}
