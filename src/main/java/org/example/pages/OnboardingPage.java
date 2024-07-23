package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWait;
import org.example.util.WebElementUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnboardingPage extends WebTestBase {

    @FindBy(xpath = "//input[@value='Register']")
    WebElement registerBtn;

    @FindBy(id = "reg_email")
    WebElement registerEmail;

    @FindBy(id = "reg_password")
    WebElement registerPassword;

    @FindBy(xpath = "//h2[text()='Register']")
    WebElement registerText;

    @FindBy(xpath = "//strong[text()='Error:']")
    WebElement onboardErrorMsg;

    public OnboardingPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean registerText() {
        CommonWait.waitUntilElementToBeClickable(registerText);
        return WebElementUtil.getElementDisplayed(registerText);
    }

    public void setRegister(String emailId, String paswd) {
        WebElementUtil.sendKeysToElements(registerEmail, emailId);
        WebElementUtil.sendKeysToElements(registerPassword, paswd);
        CommonWait.waitUntilElementToBeClickable(registerBtn);

    }

    public String setOnboardErrorMsg() {
        CommonWait.waitUntilElementToBeClickable(onboardErrorMsg);
        return WebElementUtil.getTextOfElement(onboardErrorMsg);
    }
}
