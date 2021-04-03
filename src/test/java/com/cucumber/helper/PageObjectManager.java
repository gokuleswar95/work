package com.cucumber.helper;

import org.openqa.selenium.WebDriver;

import com.pom.org.GoLogin_1;
import com.pom.org.GoLogin_2;

public class PageObjectManager {
	
	public static WebDriver driver;
	
	private GoLogin_1 gl;
	private GoLogin_2 lg;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	public GoLogin_1 getGl() {
		gl = new GoLogin_1(driver);
		return gl;
	}
	public GoLogin_2 getLg() {
		lg = new GoLogin_2(driver);
		return lg;
	}
	
	

}
