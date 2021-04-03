package com.cucumber.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.helper.FileReaderManager;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.org.Goibibo_Project.BaseClass;
import com.cucumber.runner.Runner;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User launch the applicationn$")
	public void user_launch_the_applicationn() throws Throwable {
		String url = FileReaderManager.getInstance().getCrInstance().url();
		get(url);
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		sendKeys(pom.getGl().getName(), arg1);
	}

	@Then("^User validates the username$")
	public void user_validates_the_username() throws Throwable {
		elementClick(pom.getGl().getConti_btn());
		Thread.sleep(3000);
	}

	@Given("^User enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
		sendKeys(pom.getLg().getPass(), arg1);
	}

	@Then("^User validates the password$")
	public void user_validates_the_password() throws Throwable {
		elementClick(pom.getLg().getSignin_btn());
	}
}
