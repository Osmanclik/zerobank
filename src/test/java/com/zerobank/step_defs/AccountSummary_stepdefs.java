package com.zerobank.step_defs;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_stepdefs {

    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
    @Then("Validate following titles")
    public void validate_following_titles(List<String> expected) {
        List<String> actual= accountSummaryPage.getAcoountTypeText();
        Assert.assertEquals(expected,actual);
    }
    @Then("Validate Credit Account columns")
    public void validate_credit_account_columns(List<String> expected) {
        List<String> actual= accountSummaryPage.getCreditAccountTypes();
        Assert.assertEquals(expected,actual);
    }


}
