package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.ActionUtil;
import org.example.util.CommonWait;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CafeFinderPage extends WebTestBase {

    @FindBy(xpath = "//div[@class='filter_item']")
    WebElement camposCafeDropDown;

    @FindBy(xpath = "//li[@class='filter_item-list-item ng-binding ng-scope']")
    WebElement postcodeOption;

    @FindBy(xpath = "//input[@id='locationSearch']")
    WebElement postcodeTextBox;

    @FindBy(xpath = "//button[@id='locationSearchButton']")
    WebElement findBtn;

    public CafeFinderPage(){
        PageFactory.initElements(driver, this);
    }

    public void setCamposCafeDropDown(){
        ActionUtil.moveToElement(camposCafeDropDown);
        WebElementUtil.clickOnElement(camposCafeDropDown);
    }

    public void setPostcodeOption(){
        ActionUtil.moveToElement(postcodeOption);
        WebElementUtil.clickOnElement(postcodeOption);
    }

    public void setPostcodeTextBox(String postcode){
        ActionUtil.moveToElement(postcodeTextBox);
        CommonWait.waitUntilElementToBeClickable(postcodeTextBox);
        WebElementUtil.sendKeysToElements(postcodeTextBox, postcode);
        WebElementUtil.clickOnElement(findBtn);
    }
}
