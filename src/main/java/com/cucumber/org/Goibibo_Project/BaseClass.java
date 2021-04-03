package com.cucumber.org.Goibibo_Project;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	public static WebDriver driver;
	
	//browser launch
	public static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\GOKUL\\eclipse-workspace\\Cucumber_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browsername.equalsIgnoreCase("opera")){
			System.setProperty("webdriver.opera.driver", 
					"C:\\Users\\GOKUL\\eclipse-workspace\\Selenium_2\\Driver\\operadriver.exe");
			driver = new OperaDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", 
					System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}else {
			System.out.println("Invalid browser");
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	//driver get url
	public static void get(String url) {
		driver.get(url);
	}
	
	//driver find element send keys
	public static void findElement(String opt, String locators ,String input) {
		if (opt.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locators)).sendKeys(input);
		} else if (opt.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locators)).sendKeys(input);
		} else if (opt.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locators)).sendKeys(input);
		}	
	}
	
	//webelement sendkeys
		public static void sendKeys(WebElement element, String input) {
			element.sendKeys(input);
		}
		
	//webelement click
		public static void elementClick(WebElement element) {
			element.click();
		}
		
	//webelement clear
		public static void elementClear(WebElement element) {
			element.clear();
		}
	
	//driver find element click
	public static void findElement1(String opt, String locators) {
		if (opt.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locators)).click();
		} else if (opt.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locators)).click();
		} else if (opt.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locators)).click();
		}	
	}
	
	//driver findelement clear
	public static void findElement2(String opt, String locators) {
		if (opt.equalsIgnoreCase("id")) {
			driver.findElement(By.id(locators)).clear();
		} else if (opt.equalsIgnoreCase("name")) {
			driver.findElement(By.name(locators)).clear();
		} else if (opt.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(locators)).clear();
		}	
	}
	
	// driver close
	public static void driverClose() {
		driver.close();
	}
	
	// driver quit
	public static void driverQuit() {
		driver.quit();
	}
	
	// driver navigate to
	public static void driverNavigateTo(String url) {
		driver.navigate().to(url);
	}
	
	// driver navigate back
	public static void driverNavigateBack() {
		driver.navigate().back();
	}
	
	// driver navigate forward
	public static void driverNavigateForward() {
		driver.navigate().forward();
	}
	
	// driver navigate refresh
	public static void driverNavigateRefresh() {
		driver.navigate().refresh();
	}
	
	//driver Get title
	public static void driverGetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	//driver Get Current Url
	public static void driverGetUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	//thread.sleep
	public static void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}
	
	/*//webelement sendkeys
	public static void sendKeys(WebElement element, String input) {
		element.sendKeys(input);
	}
	
	//webelement click
	public static void elementClick(WebElement element) {
		element.click();
	}*/
	
	//webelement is get text
	public static void elementGetText(WebElement element) {
		System.out.println(element.getText());
	}
	
	//webelement is get attribute
	public static void elementGetAttribute(WebElement element, String input, String opt) {
		if (opt.equalsIgnoreCase("attributename")) {
			String attribute = element.getAttribute(input);
			System.out.println("The attribute value = " + attribute);
		}else if (opt.equalsIgnoreCase("value")) {
			String attribute = element.getAttribute(input);
			System.out.println("The Textbox value is = " + attribute);
		}else {
			System.out.println("Enter in order of element name, input, option(attributename or value)");
		}	
	}
	
	//webelement is selected
	public static void elementIsSelected(WebElement element) {
		System.out.println("Selected or not = " + element.isSelected());
	}
	
	//webelement is displayed
	public static void elementIsDisplayed(WebElement element) {
		System.out.println("Displayed or not = " + element.isDisplayed());
	}
	
	//webelement is enabled 
	public static void elementIsEnabled(WebElement element) {
		System.out.println("Enabled or not = " + element.isEnabled());
	}
	
	//dropdown
	public static void dropDown(WebElement element, String opt, String input) {
		Select s = new Select(element);
		if (opt.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(input));
		}else if (opt.equalsIgnoreCase("value")) {
			s.selectByValue(input);
		}else if (opt.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(input);
		}else {
			System.out.println("Enter in order of element name, option(index or value or visibletext), input");
		}
	}
	
	//dropdown get options
	public static void getOPtions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement li : options) {
			System.out.println(li.getText());
		}
	}
	
	//dropdown is multiple
	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		System.out.println("Multiple or not = " + s.isMultiple());
	}
	
	//dropdown first selected options
	public static void firstSelectedOption(WebElement element) {
		Select s = new Select(element);
		System.out.println("First selected option is = " + s.getFirstSelectedOption().getText());
	}
	
	//dropdown all selected options
	public static void allSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> list = s.getAllSelectedOptions();
		for (WebElement li : list) {
			System.out.println(li.getText());
		}
	}
	
	//scroll up and down
	public static void ScrollUpDown(WebElement element, String opt) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		if (opt.equalsIgnoreCase("scrollup")) {
			js.executeScript("arguments[0].scrollIntoView(false);", element);
		}else if (opt.equalsIgnoreCase("scrolldown")) {
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}else {
			System.out.println("Enter in order of element name, option(scrollup or scrolldown)");
		}
	}
	
	//screenshot
	public static void screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr_File = ts.getScreenshotAs(OutputType.FILE);
		File dst_File = new File("C:\\Users\\GOKUL\\eclipse-workspace\\Cucumber_Project\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(scr_File, dst_File);
	}
	
	/*//simple alert
	public static void simpleAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}*/
	
	//alert
	public static void conformAlert(String opt) {
		if (opt.equalsIgnoreCase("accept")) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}else if (opt.equalsIgnoreCase("cancel")) {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
	}
	
	//prompt alert
	public static void promptAlert(String input) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
		alert.accept();
	}
	
	//mouse hover actions
	public static void actions(WebElement element, String opt) {
		Actions ac = new Actions(driver);
		if (opt.equalsIgnoreCase("contextclick")) {
			ac.contextClick().build().perform();
		}else if (opt.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).build().perform();
		}else if (opt.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(element).build().perform();
		}else if (opt.equalsIgnoreCase("movetoelementclick")) {
			ac.moveToElement(element).click().build().perform();
		}
	}
	
	//drag and drop
	public static void dragDrop(WebElement element, WebElement element1) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(element, element1);
	}
	
	//frames
	public static void frames(int index) {
		driver.switchTo().frame(index);
	}
}
