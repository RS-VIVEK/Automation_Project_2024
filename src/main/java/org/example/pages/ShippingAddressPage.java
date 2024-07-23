package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.ActionUtil;
import org.example.util.DropDownUtil;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressPage extends WebTestBase {

    @FindBy(xpath = "//a[@href='https://camposcoffee.com/my-account/edit-address/shipping/']")
    WebElement addShippingAddresses;

    @FindBy(xpath = "//input[@id='shipping_first_name']")
    WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@id='shipping_last_name']")
    WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@id='shipping_address_1']")
    WebElement streetAddressBox;

    @FindBy(xpath = "//input[@id='shipping_city']")
    WebElement suburbBox;

    @FindBy(xpath = "//select[@id='shipping_state']")
    WebElement selectStateBox;

    @FindBy(xpath = "//input[@id='shipping_postcode']")
    WebElement postcodeBox;

    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phoneNumberBox;

    @FindBy(xpath = "//button[text()='Save address']")
    WebElement saveAddressBtn;

    public ShippingAddressPage() {
        PageFactory.initElements(driver, this);
    }

    public void setAddShippingAddresses(){
        ActionUtil.moveToElement(addShippingAddresses);
        WebElementUtil.clickOnElement(addShippingAddresses);
    }

    public void setFirstName(String firstName){
        WebElementUtil.sendKeysToElements(firstNameTextBox, firstName);
    }

    public void setLastName(String lastName){
        WebElementUtil.sendKeysToElements(lastNameTextBox, lastName);
    }

    public void setStreetAddress(String streetAddress){
        WebElementUtil.sendKeysToElements(streetAddressBox, streetAddress);
    }

    public void setSuburb(String suburb){
        WebElementUtil.sendKeysToElements(suburbBox, suburb);
    }

    public void setSelectState(String stateCode){
        ActionUtil.moveToElement(selectStateBox);
        DropDownUtil.selectDropDownByVisibleText(selectStateBox, stateCode);
    }

    public void setPostcode(String postcode){
        WebElementUtil.sendKeysToElements(postcodeBox, postcode);
    }

    public void setSaveAddressBtn(){
        WebElementUtil.clickOnElement(saveAddressBtn);
    }
}
