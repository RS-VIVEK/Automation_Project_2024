package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.ActionUtil;
import org.example.util.CommonWait;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends WebTestBase {

    @FindBy(xpath = "//strong[text()='ERROR']")
    WebElement errorMsg;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement ShopIcon;

    @FindBy(xpath = "//a[text()='Coffee']")
    WebElement coffee;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutBtn;

    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement myAccountText;

    @FindBy(xpath = "//strong[text()='Error:']")
    WebElement errorMsgText;

    @FindBy(xpath = "//a[text()='Addresses']")
    WebElement addressesTab;

    @FindBy(xpath = "//a[text()='Confirm and log out']")
    WebElement confirmLogout;

    @FindBy(xpath = "//h1[text()='Sorry, you have been blocked']")
    WebElement logOutFailMsg;


    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public String getTextOfMyAccount() {
        return WebElementUtil.getTextOfElement(myAccountText);
    }

    public String errorTextMsg() {
        return WebElementUtil.getTextOfElement(errorMsg);
    }

    public boolean logoutBtnDisplay() {
        return WebElementUtil.getElementDisplayed(logoutBtn);
    }

    public String setErrorMsgText() {
        return WebElementUtil.getTextOfElement(errorMsgText);
    }

    public void setAddressesTab() {
        ActionUtil.moveToElement(addressesTab);
        WebElementUtil.clickOnElement(addressesTab);
    }

    public void setLogoutBtn(){
        CommonWait.waitUntilElementToBeClickable(logoutBtn);
    }

    public void setConfirmLogout(){
        CommonWait.waitUntilElementToBeClickable(confirmLogout);
    }

    public boolean setLogOutFailMsg(){
        return WebElementUtil.getElementDisplayed(logOutFailMsg);
    }

}
