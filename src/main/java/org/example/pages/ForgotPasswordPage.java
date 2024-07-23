package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends WebTestBase {

    @FindBy(id = "user_login")
    WebElement emailTextBox;

    @FindBy(xpath = "//div[@class ='woocommerce-message']")
    WebElement passwordResetText;

    @FindBy(xpath = "//input[@class='woocommerce-Button button']")
    WebElement resetPasswordBtn;

    public ForgotPasswordPage(){
        PageFactory.initElements(driver, this);
    }

    public void forgotPasswordEmailBox(String emailId){
        WebElementUtil.sendKeysToElements(emailTextBox, emailId);
    }

    public void resetPasswordBtn(){
        WebElementUtil.clickOnElement(resetPasswordBtn);
    }

    public boolean testLinkSentText(){
        return WebElementUtil.getElementDisplayed(passwordResetText);
    }
}
