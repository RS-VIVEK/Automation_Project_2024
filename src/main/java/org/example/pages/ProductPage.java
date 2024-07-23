package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.ActionUtil;
import org.example.util.CommonWait;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends WebTestBase {

    @FindBy(xpath = "//h1[@class='single-product__content__summary__title']")
    WebElement camposSuperiorText;

    @FindBy(xpath = "//h1[text()='Campos Superior Blend']")
    WebElement bagSizeDropDown;

    @FindBy(xpath = "//div[text()='Ground']")
    WebElement grindOption;

    @FindBy(xpath = "//label[text()='Espresso - Home']")
    WebElement espressoHomeOption;

    @FindBy(xpath = "//div[text()='Subscription']")
    WebElement subscriptionOption;

    @FindBy(xpath = "//label[text()='Weekly']")
    WebElement weeklyOption;

    @FindBy(xpath = "//a[@class='quantity-input__icon quantity-input__icon--plus']")
    WebElement numberOfProduct;

    @FindBy(xpath = "//option[@value='500g']")
    WebElement valueKg;

    @FindBy(xpath = "//a[@class='button add-to-cart__button button--primary']")
    WebElement addToCartBtn;

    @FindBy(xpath = " //div[contains(text(),'Success!')]")
    WebElement successMsg;

    @FindBy(xpath = "//a[text()='Continue shopping']")
    WebElement continueBtn;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public Boolean setCamposSuperiorText() {
        CommonWait.waitUntilElementToBeClickable(camposSuperiorText);
        return WebElementUtil.getElementDisplayed(camposSuperiorText);
    }

    public void setBagSizeDropDown() {
        WebElementUtil.clickOnElement(bagSizeDropDown);
    }

    public void setValueKg() {
        WebElementUtil.clickOnElement(valueKg);
    }

    public void setGrindOption() {
        CommonWait.waitUntilElementToBeClickable(grindOption);
        WebElementUtil.clickOnElement(grindOption);
    }

    public void setEspressoHomeOption() {
        CommonWait.waitUntilElementToBeClickable(espressoHomeOption);
        WebElementUtil.clickOnElement(espressoHomeOption);
    }

    public void setSubscriptionOption() {

        CommonWait.waitUntilElementToBeClickable(subscriptionOption);
        WebElementUtil.clickOnElement(subscriptionOption);
    }

    public void setWeeklyOption() {
        CommonWait.waitUntilElementToBeClickable(weeklyOption);
        WebElementUtil.clickOnElement(weeklyOption);
    }

    public void setAddToCartBtn() {
        CommonWait.waitUntilElementToBeClickable(addToCartBtn);
    }

        public Boolean setSuccessText() {
        CommonWait.waitUntilElementToBeClickable(successMsg);
            return WebElementUtil.getElementDisplayed(successMsg);
        }
    public String setContinueBtn() {
        return WebElementUtil.getTextOfElement(continueBtn);
    }

    public void setContinueBtnClick() {
        ActionUtil.moveToElement(continueBtn);
        WebElementUtil.clickOnElement(continueBtn);
    }

}
