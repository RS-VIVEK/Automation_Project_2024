package testclasses;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @Test(description = "Verify login with valid username and password")
    public void verifyWithValidUsernamePassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLogin(prop.getProperty("username"), prop.getProperty("password"));
        String myAccountText = myAccountPage.getTextOfMyAccount();
        softAssert.assertEquals(myAccountText, "MY ACCOUNT", "MY ACCOUNT Text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Verify logout button is displayed")
    public void verifyLogoutBtnDisplayed(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLogin(prop.getProperty("username"), prop.getProperty("password"));
        softAssert.assertTrue(myAccountPage.logoutBtnDisplay(), "Logout button should be displayed");
        softAssert.assertAll();
    }

    @Test(description = "Verify login with Invalid username and valid password")
    public void verifyWithInvalidUsernamePassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLogin(prop.getProperty("username1"), prop.getProperty("password"));
        String errorMsgText = myAccountPage.errorTextMsg();
        softAssert.assertEquals(errorMsgText, "ERROR", "ERROR Text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Verify login with Valid username and Invalid password")
    public void verifyWithValidUsernameInvalidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLogin(prop.getProperty("username"), prop.getProperty("password1"));
        String errorMsgText = myAccountPage.errorTextMsg();
        softAssert.assertEquals(errorMsgText, "ERROR", "ERROR Text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Verify login with Invalid username and Invalid password")
    public void verifyWithInvalidUsernameInvalidPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLogin(prop.getProperty("username1"), prop.getProperty("password1"));
        String errorMsgText = myAccountPage.errorTextMsg();
        softAssert.assertEquals(errorMsgText, "ERROR", "ERROR Text should be match");
        softAssert.assertAll();
    }

    @Test(description = "Verify login without username and password")
    public void verifyWithWithoutUsernamePassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLoginWithoutUsernamePassword();
        String errorMsgText = myAccountPage.setErrorMsgText();
        softAssert.assertEquals(errorMsgText, "Error:", "Error: Text should be match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
