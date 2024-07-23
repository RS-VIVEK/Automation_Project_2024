package testclasses;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.example.pages.ShippingAddressPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShippingAddressTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ShippingAddressPage shippingAddressPage;

    public ShippingAddressTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        shippingAddressPage = new ShippingAddressPage();

    }

    @Test(description = "Verify Adding Shipping address")
    public void verifyAddingShippingAddress(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLogin(prop.getProperty("username"), prop.getProperty("password"));
        String myAccountText = myAccountPage.getTextOfMyAccount();
        softAssert.assertEquals(myAccountText, "MY ACCOUNT", "MY ACCOUNT Text should be match");
        myAccountPage.setAddressesTab();
        shippingAddressPage.setAddShippingAddresses();
        shippingAddressPage.setFirstName(prop.getProperty("firstName"));
        shippingAddressPage.setLastName(prop.getProperty("lastName"));
        shippingAddressPage.setStreetAddress(prop.getProperty("streetAddress"));
        shippingAddressPage.setSuburb(prop.getProperty("suburb"));
        shippingAddressPage.setSelectState(prop.getProperty("state"));
        shippingAddressPage.setPostcode(prop.getProperty("postcode"));
        shippingAddressPage.setSaveAddressBtn();
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
