package com.zerobank.step_defs;

import com.zerobank.pages.OnlineBankingPage;
import io.cucumber.java.en.When;

public class OnlineBanking_stepdefs {
    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();

    @When("Go to {string} submenu")
    public void go_to_submenu(String string) {
        onlineBankingPage.tapOnSubMenu(string);
    }

}
