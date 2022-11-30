package org.stepdefinition;

import org.baseclass.BaseClass;
import org.baseclass.PojoClasses;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookUff extends BaseClass {
	PojoClasses p;
	
	@Given("Launch the chrome browser and maximize the browser")
	public void launch_the_chrome_browser_and_maximize_the_browser() {
		browserLaunch();
		maximize();
	}

	@When("Launch the facebook url in chrome browser")
	public void launch_the_facebook_url_in_chrome_browser() {
		geturl("https://www.facebook.com/");
	}

	@When("To pass the positive and negative username {string} in email field")
	public void to_pass_the_positive_and_negative_username_in_email_field(String emailids) {
	 p=new PojoClasses();
		passTxt(p.getEmail(), emailids);   
	}

	@When("To pass the positive and negative passwords {string} in password field")
	public void to_pass_the_positive_and_negative_passwords_in_password_field(String passwords) {
	    p=new PojoClasses();
	    passTxt(p.getPass(), passwords);
	}

	@Then("close the browser")
	public void close_the_browser() {
		quitchrome();
	}
	


}
