package testclasses;

import org.example.pages.*;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ProductCategoryPage productCategoryPage;
    ProductPage productPage;
    CartPage cartPage;

    public CartTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        productCategoryPage = new ProductCategoryPage();
        productPage = new ProductPage();
        cartPage = new CartPage();

    }

    @Test(description = "Verify the cartIcon")
    public void verifyCartIcon() {
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        homePage.setCartIcon();
        String showResultText = productCategoryPage.setShowingResultText();
        softAssert.assertEquals(showResultText, "SHOWING 22 OF 107 RESULTS");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
