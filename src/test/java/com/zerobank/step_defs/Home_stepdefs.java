package com.zerobank.step_defs;

import com.zerobank.pages.HomePage;
import io.cucumber.java.en.When;

public class Home_stepdefs {
    HomePage homePage= new HomePage();

    @When("Go to {string} menu")
    public void go_to_menu(String string) {
        homePage.tapOnMenu(string);

    }

}
