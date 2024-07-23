package testclasses;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.OnboardingPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OnboardingTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    OnboardingPage onboardingPage;

    public OnboardingTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        onboardingPage = new OnboardingPage();
    }

    @Test(description = "Verify Onboarding account with Valid Email and Valid Password")
    public void verifyOnboardingWIthValidEmailValidPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.clickHereRegister();
        softAssert.assertTrue(onboardingPage.registerText(), "Register text should be displayed");
        onboardingPage.setRegister(prop.getProperty("emailId"), prop.getProperty("password_Register"));
        softAssert.assertAll();
    }


    @Test(description = "Verify Onboarding account With valid Email and InvalidPassword")
    public void verifyOnboardingWithValidEmailInvalidPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.clickHereRegister();
        softAssert.assertTrue(onboardingPage.registerText(), "Register text should be displayed");
        onboardingPage.setRegister(prop.getProperty("emailId1"), prop.getProperty("password_Register1"));
        softAssert.assertAll();
    }

    @Test(description = "Verify Onboarding account with Invalid Email and InvalidPassword")
    public void verifyOnboardingWithInvalidEmailInvalidPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.clickHereRegister();
        softAssert.assertTrue(onboardingPage.registerText(), "Register text should be displayed");
        onboardingPage.setRegister(prop.getProperty("emailId1"), prop.getProperty("password_Register1"));
        softAssert.assertAll();
    }

    @Test(description = "Verify Onboarding account without Email and Password")
    public void verifyOnboardingWithoutEmailPassword(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.clickHereRegister();
        softAssert.assertTrue(onboardingPage.registerText(), "Register text should be displayed");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
