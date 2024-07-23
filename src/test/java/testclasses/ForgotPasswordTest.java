package testclasses;

import org.example.pages.ForgotPasswordPage;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccountPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ForgotPasswordTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ForgotPasswordPage forgotPasswordPage;

    public ForgotPasswordTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        forgotPasswordPage = new ForgotPasswordPage();
    }

    @Test(description = "Verify forgot password")
    public void verifyForgotPassword() {
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.forgotPasswordBtn();
        forgotPasswordPage.forgotPasswordEmailBox(prop.getProperty("username"));
        forgotPasswordPage.resetPasswordBtn();
        softAssert.assertTrue(forgotPasswordPage.testLinkSentText(), "Password reset text should be sent");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
