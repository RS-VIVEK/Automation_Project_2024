package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWait;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Click here']")
    WebElement clickHereRegister;

    @FindBy(id = "username")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Lost your password?']")
    WebElement resetPasswordLink;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void setLogin(String userName, String password) {
        WebElementUtil.sendKeysToElements(userNameTextBox, userName);
        WebElementUtil.sendKeysToElements(passwordTextBox, password);
        CommonWait.waitUntilElementToBeClickable(loginBtn);
    }

    public void setLoginWithoutUsernamePassword() {
        CommonWait.waitUntilElementToBeClickable(loginBtn);
    }

    public void forgotPasswordBtn() {
        WebElementUtil.clickOnElement(resetPasswordLink);
    }

    public void clickHereRegister() {
        CommonWait.waitUntilElementToBeClickable(clickHereRegister);
    }

}
