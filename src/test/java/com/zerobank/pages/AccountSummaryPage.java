package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage {
    @FindBy(xpath = "//h2[@class='board-header']")
    private List<WebElement> accountTypes;
    @FindBy(xpath = "(//table)[3]//th")
    private List<WebElement> creditAccountTypes;

    public List<String> getAcoountTypeText(){
       return BrowserUtils.getElementsText(accountTypes);
    }

    public List<String> getCreditAccountTypes(){
        return BrowserUtils.getElementsText(creditAccountTypes);
    }
}
