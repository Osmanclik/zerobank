package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this); // by class ını kullanmadan locate edebiliyoruz
    }

    @FindBy(css="button#signin_button")
    private WebElement signInButton;

    public void tapOnSignInButton(){
        BrowserUtils.clickWithJS(signInButton); //selenium içerisinde sadece click işlemi yapan metod

    }
}
