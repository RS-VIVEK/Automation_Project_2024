package testclasses;

import org.example.pages.HomePage;
import org.example.pages.PartnershipPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PartnershipTest extends WebTestBase {
    HomePage homePage;
    PartnershipPage partnershipPage;

    public PartnershipTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        partnershipPage = new PartnershipPage();
    }

    @Test(description = "Verify partnership register")
    public void verifyPartnershipRegister(){
        homePage.CloseFirstAd();
        homePage.setWholesaleTab();
        partnershipPage.setNameTextBox(prop.getProperty("firstName"));
        partnershipPage.setLastNameTextbox(prop.getProperty("lastName"));
        partnershipPage.setPhoneNumberTextBox(prop.getProperty("phoneNumber"));
        partnershipPage.setEmailTextBox(prop.getProperty("email"));
        partnershipPage.setBusinessTypeDropDown(prop.getProperty("businessType"));
        partnershipPage.setBusinessNameTextBox(prop.getProperty("businessName"));
        partnershipPage.setBusinessAddressTextBox(prop.getProperty("businessAddress"));
        partnershipPage.setStateDropDown(prop.getProperty("state1"));
        partnershipPage.setPostcodeTextBox(prop.getProperty("postcode"));
        partnershipPage.setAbnTextBox(prop.getProperty("abn"));
        partnershipPage.setExistingBusinessDropDown(prop.getProperty("existingBusiness"));
        partnershipPage.setFacebookTextBox(prop.getProperty("facebook"));
        partnershipPage.setInstagramTextBox(prop.getProperty("instagram"));
        partnershipPage.setWebsiteTextBox(prop.getProperty("website"));
        partnershipPage.setRoleDropDown(prop.getProperty("role"));
        partnershipPage.setTrainingDayHourTextBox(prop.getProperty("trainingHouse"));
        partnershipPage.setExperienceTextBox(prop.getProperty("experience"));
        partnershipPage.setCoffeeUsageTextBox(prop.getProperty("coffeeUsage"));
        partnershipPage.closeAdOption();
        partnershipPage.setAdditionalInfoTextBox(prop.getProperty("additionalInfo"));
        partnershipPage.setRegisterInterestBtn();

    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
