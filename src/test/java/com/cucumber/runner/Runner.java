package com.cucumber.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.helper.FileReaderManager;
import com.cucumber.org.Goibibo_Project.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature", glue = "com\\cucumber\\stepdefinition", monochrome = true, strict = true, dryRun = false)

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {
		String browserLaunch = FileReaderManager.getInstance().getCrInstance().browserLaunch();
		driver=BaseClass.browserLaunch(browserLaunch);
	}

	@AfterClass
	public static void tearDown() {
		BaseClass.driverQuit();
	}
}
