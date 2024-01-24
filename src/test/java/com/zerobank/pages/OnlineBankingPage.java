package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;

public class OnlineBankingPage extends BasePage {
    public void tapOnSubMenu(String str){
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//span[.='"+ str +"']")));
    }
}
