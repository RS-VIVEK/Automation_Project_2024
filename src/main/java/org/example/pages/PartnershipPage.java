package org.example.pages;

import org.example.testbase.WebTestBase;
import org.example.util.ActionUtil;
import org.example.util.CommonWait;
import org.example.util.DropDownUtil;
import org.example.util.WebElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnershipPage extends WebTestBase {

    @FindBy(xpath = "//input[@id='input_5_25']")
    WebElement nameTextBox;

    @FindBy(xpath = "//input[@id='input_5_1']")
    WebElement lastNameTextbox;

    @FindBy(xpath = "//input[@id='input_5_2']")
    WebElement phoneNumberTextBox;

    @FindBy(xpath = "//input[@id='input_5_3']")
    WebElement emailTextBox;

    @FindBy(xpath = "//select[@id='input_5_4']")
    WebElement businessTypeDropDown;

    @FindBy(xpath = "//input[@id='input_5_5']")
    WebElement businessNameTextBox;

    @FindBy(xpath = "//input[@id='input_5_16']")
    WebElement businessAddressTextBox;

    @FindBy(xpath = "//select[@id='input_5_23']")
    WebElement stateDropDown;

    @FindBy(xpath = "//input[@id='input_5_19']")
    WebElement postcodeTextBox;

    @FindBy(xpath = "//input[@id='input_5_17']")
    WebElement abnTextBox;

    @FindBy(xpath = "//input[@id='input_5_7']")
    WebElement facebookTextBox;

    @FindBy(xpath = "//input[@id='input_5_22']")
    WebElement instagramTextBox;

    @FindBy(xpath = "//input[@id='input_5_21']")
    WebElement websiteTextBox;

    @FindBy(xpath = "//select[@id='input_5_18']")
    WebElement roleDropDown;

    @FindBy(xpath = "//select[@id='input_5_24']")
    WebElement existingBusinessDropDown;

    @FindBy(xpath = " //input[@id='input_5_8']")
    WebElement trainingDayHourTextBox;

    @FindBy(xpath = "//input[@id='input_5_9']")
    WebElement experienceTextBox;

    @FindBy(xpath = "//input[@id='input_5_12']")
    WebElement coffeeUsageTextBox;

    @FindBy(xpath = "//textarea[@id='input_5_13']")
    WebElement additionalInfoTextBox;

    @FindBy(xpath = "//input[@id='gform_submit_button_5']")
    WebElement registerInterestBtn;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement closeAd;

    public PartnershipPage() {
        PageFactory.initElements(driver, this);
    }

    public void setNameTextBox(String name) {
        WebElementUtil.sendKeysToElements(nameTextBox, name);
    }

    public void setLastNameTextbox(String lastName) {
        WebElementUtil.sendKeysToElements(lastNameTextbox, lastName);
    }

    public void setPhoneNumberTextBox(String phoneNumber) {
        WebElementUtil.sendKeysToElements(phoneNumberTextBox, phoneNumber);
    }

    public void setEmailTextBox(String emailText) {
        WebElementUtil.sendKeysToElements(emailTextBox, emailText);
    }

    public void setBusinessTypeDropDown(String type) {
        CommonWait.waitUntilElementToBeClickable(businessTypeDropDown);
        DropDownUtil.selectDropDownByVisibleText(businessTypeDropDown, type);
    }

    public void setBusinessNameTextBox(String businessName) {
        WebElementUtil.sendKeysToElements(businessNameTextBox, businessName);
    }

    public void setBusinessAddressTextBox(String address) {
        WebElementUtil.sendKeysToElements(businessAddressTextBox, address);
    }

    public void setStateDropDown(String state) {
        DropDownUtil.selectDropDownByVisibleText(stateDropDown, state);
    }

    public void setPostcodeTextBox(String postCode) {
        WebElementUtil.sendKeysToElements(postcodeTextBox, postCode);
    }

    public void setAbnTextBox(String abn) {
        WebElementUtil.sendKeysToElements(abnTextBox, abn);
    }

    public void setFacebookTextBox(String facebook) {
        WebElementUtil.sendKeysToElements(facebookTextBox, facebook);
    }

    public void setInstagramTextBox(String instagram) {
        WebElementUtil.sendKeysToElements(instagramTextBox, instagram);
    }

    public void setWebsiteTextBox(String website) {
        WebElementUtil.sendKeysToElements(websiteTextBox, website);
    }

    public void setRoleDropDown(String role) {
        DropDownUtil.selectDropDownByVisibleText(roleDropDown, role);
    }

    public void setExistingBusinessDropDown(String existingBusiness) {
        DropDownUtil.selectDropDownByVisibleText(existingBusinessDropDown, existingBusiness);
    }

    public void setTrainingDayHourTextBox(String trainingHours) {
        WebElementUtil.sendKeysToElements(trainingDayHourTextBox, trainingHours);
    }

    public void setExperienceTextBox(String experience) {
        WebElementUtil.sendKeysToElements(experienceTextBox, experience);
    }

    public void setCoffeeUsageTextBox(String usage) {
        WebElementUtil.sendKeysToElements(coffeeUsageTextBox, usage);
    }

    public void setAdditionalInfoTextBox(String additionalInfo) {
        CommonWait.waitUntilElementToBeClickable(additionalInfoTextBox);
        WebElementUtil.sendKeysToElements(additionalInfoTextBox, additionalInfo);
    }

    public void closeAdOption(){
        CommonWait.waitUntilElementToBeClickable(closeAd);
    }

    public void setRegisterInterestBtn() {
        ActionUtil.moveToElement(registerInterestBtn);
        CommonWait.waitUntilElementToBeClickable(registerInterestBtn);
    }
}
