package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.CommonWait;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCategoryPage extends WebTestBase {

    @FindBy(xpath = "//div[text()='Campos Superior Blend']")
    WebElement camposSuperiorBlend;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeFirstAd;

    @FindBy(xpath = "//div[contains(text(), 'Showing')]")
    WebElement showingResultText;

    public ProductCategoryPage(){
        PageFactory.initElements(driver, this);
    }

    public void camposSuperiorProduct(){
        WebElementUtil.clickOnElement(camposSuperiorBlend);
    }

    public void CloseFirstAd() {
        CommonWait.waitUntilElementToBeClickable(closeFirstAd);
    }

    public String setShowingResultText(){
        CommonWait.waitUntilElementToBeClickable(showingResultText);
        return WebElementUtil.getTextOfElement(showingResultText);
    }
}
