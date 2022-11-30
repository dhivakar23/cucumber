package org.stepdefinition;

import org.baseclass.BaseClass;
import org.baseclass.PojoClasses;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook extends BaseClass {
	
	PojoClasses p;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
	   browserLaunch();
	   maximize();
	}

	@When("To launch the facebook url")
	public void to_launch_the_facebook_url() {
	    geturl("https://www.facebook.com/");
	}

	@When("To pass invalid email and valid password")
	public void to_pass_invalid_email_and_valid_password() {
	   p=new PojoClasses();
		passTxt(p.getEmail(), "dhivakar");
		passTxt(p.getPass(), "123456");
	}

	@When("To click loginbutton")
	public void to_click_loginbutton() {
	  p=new PojoClasses();
	  webclick(p.getLoginbtn());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   quitchrome();
	}



}
