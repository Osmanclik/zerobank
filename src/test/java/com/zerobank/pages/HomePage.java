package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public void tapOnMenu(String str){
        BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("//strong[.='"+ str + "']")));
    }
}
