package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWait;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends WebTestBase{

    @FindBy(xpath = "//h3[@class='cart__heading']")
    WebElement yourOrderText;

    @FindBy(xpath = "//div[@class='cart__remove__icon']")
    WebElement deleteIcon;

    public CartPage(){
        PageFactory.initElements(driver, this);
    }

    public String setYourOrderText(){
        CommonWait.waitUntilElementToBeClickable(yourOrderText);
       return WebElementUtil.getTextOfElement(yourOrderText);
    }
}
