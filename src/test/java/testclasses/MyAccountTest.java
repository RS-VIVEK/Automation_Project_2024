package testclasses;

import org.example.pages.*;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyAccountTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    CartPage cartPage;
    ProductCategoryPage productCategoryPage;

    public MyAccountTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        cartPage = new CartPage();
        productCategoryPage = new ProductCategoryPage();
    }

    @Test(description = "Verify the Cart Icon is clickable")
    public void verifyCartICon(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        homePage.setCartIcon();
        String showResultText = productCategoryPage.setShowingResultText();
        softAssert.assertEquals(showResultText, "Showing");
    }

    @Test(description = "Verify the logout function")
    public void verifyLogoutFunction(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLogin(prop.getProperty("username"), prop.getProperty("password"));
        String myAccountText = myAccountPage.getTextOfMyAccount();
        softAssert.assertEquals(myAccountText, "MY ACCOUNT", "MY ACCOUNT Text should be match");
        myAccountPage.logoutBtnDisplay();
        myAccountPage.setLogoutBtn();
        myAccountPage.setConfirmLogout();
        boolean logoutFailMsgText = myAccountPage.setLogOutFailMsg();
        softAssert.assertTrue(logoutFailMsgText, "logout shouldn't be done");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
