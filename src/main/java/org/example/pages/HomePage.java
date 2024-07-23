package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.ActionUtil;
import org.example.util.CommonWait;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//a[text()='Coffee']")
    WebElement coffeeOption;

    @FindBy(xpath = "//a[text()='Shop']")
    WebElement shopOption;

    @FindBy(xpath = "//li[@id='menu-item-150']")
    WebElement cafeFinderBtn;

    @FindBy(xpath = "//a[@class='user-controls__ul__li__a']")
    WebElement userLogo;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeFirstAd;

    @FindBy(xpath = "//span[text()='Newsletter sign up']")
    WebElement newsletterBtn;

    @FindBy(xpath = "//a[@class='menu__ul__li__a'][text()='Wholesale']")
    WebElement wholesaleTab;

    @FindBy(xpath = "//input[@id='gform_submit_button_13']")
    WebElement confirmBtn;

    @FindBy(xpath = "(//strong[text()='WELCOMECAMPOS10'])[1]")
    WebElement confirmationMessage;

    @FindBy(xpath = "//input[@id='input_13_1']")
    WebElement firstOrderEmailTextBox;

    @FindBy(xpath = "//a[@class='mini-cart']")
    WebElement cartIcon;

    @FindBy(xpath = "//input[@id='s']")
    WebElement searchOption;

    @FindBy(xpath = "//input[@id='searchsubmit']")
    WebElement searchBtn;

    @FindBy(xpath = "//h5[contains(text(),'Results')]")
    WebElement resultText;

    @FindBy(xpath = "//div[text()='Oops. Looks like you are already subscribed.']")
    WebElement emailAlreadySubscribedMsg;

    @FindBy(xpath = "//a[text()='WOOLWORTHS COMP']")
    WebElement woolsWorthCompTab;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void CloseFirstAd() {
        CommonWait.waitUntilElementToBeClickable(closeFirstAd);
        CommonWait.waitUntilElementToBeClickable(userLogo);
    }

    public void cafeFinderBtn() {
        ActionUtil.moveToElement(cafeFinderBtn);
        WebElementUtil.clickOnElement(cafeFinderBtn);
    }

    public void newsLetterBtn() {
        WebElementUtil.clickOnElement(newsletterBtn);
    }

    public void setShopOption() {
        ActionUtil.moveToElement(shopOption);
        WebElementUtil.clickOnElement(coffeeOption);
    }

    public void setWholesaleTab(){
        ActionUtil.moveToElement(wholesaleTab);
        WebElementUtil.clickOnElement(wholesaleTab);
    }

    public void setFirstOrderEmailTextBox(String emailBox){
        ActionUtil.moveToElement(firstOrderEmailTextBox);
        WebElementUtil.sendKeysToElements(firstOrderEmailTextBox, emailBox);
    }

    public void setConfirmBtn(){
        WebElementUtil.clickOnElement(confirmBtn);
    }

    public String setConfirmationMessage(){
        CommonWait.waitUntilElementToBeClickable(confirmationMessage);
        return WebElementUtil.getTextOfElement(confirmationMessage);
    }

    public String setEmailAlreadySubscribedMsg(){
        return WebElementUtil.getTextOfElement(emailAlreadySubscribedMsg);
    }

    public void setSearchOption(String search){
        CommonWait.waitUntilElementToBeClickable(searchOption);
        WebElementUtil.sendKeysToElements(searchOption, search);
        CommonWait.waitUntilElementToBeClickable(searchBtn);
        WebElementUtil.getTextOfElement(searchBtn);
    }

    public Boolean setResultText(){
        return WebElementUtil.getElementDisplayed(resultText);
    }

    public void setCartIcon() {
        ActionUtil.moveToElement(cartIcon);
        CommonWait.waitUntilElementToBeClickable(cartIcon);
        WebElementUtil.clickOnElement(cartIcon);
    }

    public void setWoolsWorthCompTab(){
        ActionUtil.moveToElement(woolsWorthCompTab);
        CommonWait.waitUntilElementToBeClickable(woolsWorthCompTab);
    }
}
