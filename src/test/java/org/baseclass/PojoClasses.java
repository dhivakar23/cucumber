package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class PojoClasses extends BaseClass{
	public PojoClasses() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement pass;
	@FindBy(name="login")
	private WebElement loginbtn;
	
	
	
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	

}
