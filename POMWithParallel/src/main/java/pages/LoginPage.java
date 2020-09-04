package pages;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends BaseClass {

	
	@Given("Enter username as (.*)")
	public LoginPage enterUserName(String data) throws IOException {

		try {

			driver.findElementById("username").sendKeys(data);
			reportStep("Username "+data+" entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Username "+data+" not entered successfully", "fail");
		}

		return this;

	}

	@Given("Enter password as (.*)")
	public LoginPage enterPassword(String data) throws IOException {

		try {

			driver.findElementById("password").sendKeys(data);
			reportStep("Password "+data+" entered successfully", "pass");
		} catch (Exception e) {
			reportStep("password "+data+" not entered successfully", "fail");
		}

		return this;
	}

	@When("Click login button")
	public HomePage clickLoginButton() throws IOException {
		try {
			driver.findElementByClassName("decorativeSubmit").click();
			reportStep("login clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("login button not clicked", "fail");
		}
		return new HomePage();

	}

	public LoginPage verifyErrorMessage() {
		System.out.println("error message should be displayed");

		return this;

	}

}
