package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    //PageFactory.initElements yazmaya gerek yok. çünkü burdan ne zaman
    // obje oluştursak base page de önce PageFactory.initElements çalışır

    @FindBy(css = "input#user_login")
    private WebElement loginInputBox;

    @FindBy(css = "input#user_password")
    private WebElement passwordInputBox;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement loginButton;

    public void login(){

       // loginInputBox.sendKeys(ConfigurationReader.get("username"));
        BrowserUtils.sendKeys(loginInputBox, ConfigurationReader.get("username")); //browserUtils webelemente text gönderme

       // passwordInputBox.sendKeys(ConfigurationReader.get("password"));
        BrowserUtils.sendKeys(passwordInputBox,ConfigurationReader.get("password")); //browserUtils webelemente text gönderme

       //loginButton.click();
        BrowserUtils.clickWithJS(loginButton); //browserUtils webelemente click yapma
        Driver.get().navigate().back(); //sayfadaki problem gereği back butonu ile geri geldim
    }

}
