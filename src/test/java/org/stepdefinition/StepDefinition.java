package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {
	
	public WebDriver driver;
	
	@Given("user is on the Adactine page")
	public void user_is_on_the_Adactine_page() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mselva\\Oxygen eclipse-workspace\\TestNGPrograms\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");	
	}
	@When("user should enter valid {string} and {string}")
	public void user_should_enter_valid_and(String name, String passWord) {
		
		WebElement txtUsername=driver.findElement(By.id("username"));
		txtUsername.sendKeys(name);
		WebElement txtPass=driver.findElement(By.id("password"));	
		txtPass.sendKeys(passWord);	    
	}

	@When("user should click the login page")
	public void user_should_click_the_login_page() {

		WebElement login=driver.findElement(By.id("login"));
		login.click();
		
	}
	@Then("user should verify the sucess msg")
	public void user_should_verify_the_sucess_msg() {
	String url=driver.getCurrentUrl();
	boolean hotel = url.contains("SearchHotel");
	Assert.assertTrue("verify message", hotel);
    
	}


	

}
