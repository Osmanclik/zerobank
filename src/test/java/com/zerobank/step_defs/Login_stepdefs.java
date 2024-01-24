package com.zerobank.step_defs;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_stepdefs {
    LoginPage loginPage = new LoginPage(); //login page den metodu çağırabilmek için oluşturdum

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("Tap on signIn button")
    public void tap_on_sign_in_button() {
        loginPage.tapOnSignInButton();
    }

    @When("Login to the zeroBank")
    public void login_to_the_zero_bank() {
        loginPage.login();
    }

    @Then("Validate that user is logged in")
    public void validate_that_user_is_logged_in() {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "http://zero.webappsecurity.com/index.html";
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("Enter {string} and {string}")
    public void enter_and(String string, String string2) {
        loginPage.enterUsernameAndPassword(string, string2);
    }

    @When("Tap on login button")
    public void tap_on_login_button() {
        loginPage.tapOnLoginButton();
    }

    @Then("Validate error message is displayed")
    public void validate_error_message_is_displayed() {
     String expectedErrorMessage = "Login and/or password are wrong.";
        String actualErrorMessage = loginPage.getErrorMessageText();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }


}
