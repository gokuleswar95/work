package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoLogin_1 {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@id='authMobile']")
	private WebElement name;
	
	@FindBy(xpath="//button[@id='mobileSubmitBtn']")
	private WebElement conti_btn;

	
	public GoLogin_1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getConti_btn() {
		return conti_btn;
	}
	
	
}
