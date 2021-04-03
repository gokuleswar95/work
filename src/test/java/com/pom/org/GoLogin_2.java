package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoLogin_2 {

public static WebDriver driver;
	
	@FindBy(id="authCredentialPassword")
	private WebElement pass;
	
	@FindBy(id="authCredentialPasswordSignInBtn")
	private WebElement signin_btn;

	
	public GoLogin_2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin_btn() {
		return signin_btn;
	}
}
